public class Repository {

    private Ticket[] tickets = new Ticket[0];


    public Ticket[] findAll() {
        return tickets;

    }

    public void add(Ticket ticket) {

        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];

        }
        tmp[tmp.length - 1] = ticket;
        tickets = tmp;


    }

    public void remove(int removeId) {
        if (findByid(removeId)==null){
            try {
                throw new NotFoundException  (removeId);
            } catch (NotFoundException e) {
                throw new RuntimeException(e);
            }
        }

    Ticket[] tmp = new Ticket[tickets.length - 1];


        int indexTo = 0;
        for (Ticket ticket : tickets){

            if (ticket.getId() !=removeId){
                tmp[indexTo] = ticket;
                indexTo++;
            }
        }
        tickets = tmp;

    }
    public Ticket findByid(int id){

        for (Ticket ticket : tickets){
            if (ticket.getId()==id){
                return ticket;
            }
        }
        return null;
    }


}
