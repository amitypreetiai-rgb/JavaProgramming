package Module3.synchronization;

public class DiningDeadlock {
    static final Object c1 = new Object();
    static final Object c2 = new Object();

    public static void main(String[] args) {
        Thread p1 = new Thread(() -> {
            synchronized (c1) {
                System.out.println("P1 holds chopstick 1");

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("P1 waits for chopstick 2");

                synchronized (c2) {
                    System.out.println("P1 is eating");
                }
            }
        });

        Thread p2 = new Thread(() -> {
            synchronized (c2) {
                System.out.println("P2 holds chopstick 2");

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }

                System.out.println("P2 waits for chopstick 1");

                synchronized (c1) {
                    System.out.println("P2 is eating");
                }
            }
        });

        p1.start();
        p2.start();
    }
}