package Module3.synchronization;

public class TicketBooking {
    private static int availableTickets = 5;

    public static synchronized void bookTicket(String userName) {
        if (availableTickets > 0) {
            System.out.println(userName + " booked a ticket. Tickets left: " + (availableTickets - 1));
            availableTickets--;
        }
        else {
            System.out.println(userName + " could not book a ticket. Sold out!");
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 8; i++) {
            String userName = "User-" + i;
            Thread thread = new Thread(() -> bookTicket(userName));
            thread.start();
        }
    }
}