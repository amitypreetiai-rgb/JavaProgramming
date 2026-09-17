package Module3.threads;

public class DaemonAutoSave {
    public static void main(String[] args) throws InterruptedException {

        Thread autoSaveThread = new Thread(() -> {
            while (true) {
                System.out.println("Auto-Save in progress...");
                try {
                    Thread.sleep(3000);
                }
                catch (InterruptedException e) {
                    System.out.println("Auto-save thread interrupted: " + e.getMessage());
                }
            }
        });

        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Processing file " + i + "...");
            Thread.sleep(1000);
        }

        System.out.println("File processing complete. Main thread exiting.");
    }
}