package Module3.synchronization;

class Download extends Thread {
    boolean running = true;

    public void run() {
        int i = 1;

        while (running) {
            System.out.println("Downloading chunk " + i);
            i++;

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }

        System.out.println("Download stopped.");
    }

    void stopDownload() {
        running = false;
    }
}

public class StoppingThread {
    public static void main(String[] args) throws InterruptedException {
        Download d = new Download();

        d.start();
        Thread.sleep(4000);
        d.stopDownload();
    }
}