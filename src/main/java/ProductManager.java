import java.util.Arrays;

public class ProductManager {
    private Repository repository;

    public ProductManager(Repository repository) {
        this.repository = repository;

    }


    public void add(Ticket ticket) {

        repository.add(ticket);

    }

    public void remove(int id) {

        repository.remove(id);
    }


    public Ticket[] findAll(String from, String to) {
        Ticket[] result = new Ticket[0];
        for (Ticket product : repository.findAll()) {
            if (matches(product, from, to)) {


                Ticket[] tmp = new Ticket[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];

                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }

        }
        Arrays.sort(result);
        return result;
    }

    public boolean matches(Ticket product, String from, String to) {
        if (!product.getFrom().equals(from)) {
            return false;
        }
            if (!product.getTo().equals(to)) {
                return false;
            }
return true;
    }
}