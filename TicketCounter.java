class TicketCounter {
    int tickets = 10;
    synchronized void bookTickets(String name, int count) {
        if (tickets >= count) {
            System.out.println(name + " booked " + count + " tickets");
            tickets = tickets - count;
            System.out.println("Remaining tickets: " + tickets);
        } else {
            System.out.println(name + " could not book tickets");
            System.out.println("Tickets available: " + tickets);
        }
    }
}
class Customer extends Thread {
    TicketCounter counter;
    String name;
    Customer(TicketCounter counter, String name) {
        this.counter = counter;
        this.name = name;
    }

    public void run() {
        counter.bookTickets(name, 4);
    }
}

class TicketBooking {
    public static void main(String[] args) {
        TicketCounter counter = new TicketCounter();
        Customer c1 = new Customer(counter, "Customer 1");
        Customer c2 = new Customer(counter, "Customer 2");
        Customer c3 = new Customer(counter, "Customer 3");
        c1.start();
        c2.start();
        c3.start();
    }
}