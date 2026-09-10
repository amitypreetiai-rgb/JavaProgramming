package Module3.threads;

public class CountdownTick {

    public static void main(String[] args) {

        Thread countdownThread = new Thread(() -> {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    System.out.println("Countdown thread interrupted: " + e.getMessage());
                }
            }
        });

        Thread tickThread = new Thread(() -> {
            for (int i = 1; i <= 20; i++) {
                System.out.println("Tick...");
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    System.out.println("Tick thread interrupted: " + e.getMessage());
                }
            }
        });

        countdownThread.start();
        tickThread.start();
    }
}