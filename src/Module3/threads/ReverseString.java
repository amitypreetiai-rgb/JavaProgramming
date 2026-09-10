package Module3.threads;

public class ReverseString implements Runnable {

    private String text;

    public ReverseString(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.println(text.charAt(i));
        }
    }

    public static void main(String[] args) {
        ReverseString task = new ReverseString("MULTITHREADING");
        Thread thread = new Thread(task);
        thread.start();
    }
}