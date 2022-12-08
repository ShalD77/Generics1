import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {


    @Test
    public void test1() {

        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);


        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 1000);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 400);
        Ticket ticket3 = new Ticket(3, "MSK", "SPB", 500);
        Ticket ticket4 = new Ticket(4, "MSK", "EKB", 600);
        Ticket ticket5 = new Ticket(5, "MSK", "SPB", 700);
        Ticket ticket6 = new Ticket(6, "KLD", "SPB", 800);
        Ticket ticket7 = new Ticket(7, "MSK", "SPB", 900);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket2, ticket3, ticket5, ticket7, ticket1};
        Ticket[] actual = manager.findAll("MSK", "SPB");

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test2() {

        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);


        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 1000);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 400);
        Ticket ticket3 = new Ticket(3, "MSK", "SPB", 500);
        Ticket ticket4 = new Ticket(4, "MSK", "EKB", 600);
        Ticket ticket5 = new Ticket(5, "MSK", "SPB", 700);
        Ticket ticket6 = new Ticket(6, "KLD", "SPB", 800);
        Ticket ticket7 = new Ticket(7, "MSK", "SPB", 900);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {};
        Ticket[] actual = manager.findAll("MSK", "VDE");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {

        Repository repository = new Repository();
        ProductManager manager = new ProductManager(repository);


        Ticket ticket1 = new Ticket(1, "MSK", "SPB", 1000);
        Ticket ticket2 = new Ticket(2, "MSK", "SPB", 400);
        Ticket ticket3 = new Ticket(3, "MSK", "SPB", 500);
        Ticket ticket4 = new Ticket(4, "MSK", "EKB", 600);
        Ticket ticket5 = new Ticket(5, "MSK", "SPB", 700);
        Ticket ticket6 = new Ticket(6, "KLD", "SPB", 800);
        Ticket ticket7 = new Ticket(7, "MSK", "SPB", 900);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.findAll("KLD", "SPB");

        Assertions.assertArrayEquals(expected, actual);

    }

}














