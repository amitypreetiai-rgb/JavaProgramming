package Module3.threads;

public class EvenNumber extends Thread {
    @Override
    public void run() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        EvenNumber thread = new EvenNumber();
        thread.start();
    }
}