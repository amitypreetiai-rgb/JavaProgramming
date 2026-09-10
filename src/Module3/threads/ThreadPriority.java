package Module3.threads;

public class ThreadPriority {

    public static void main(String[] args) {

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            int priority = Thread.currentThread().getPriority();
            for (int i = 1; i <= 3; i++) {
                System.out.println(threadName + " (priority " + priority + ") - message " + i);
            }
        };

        Thread worker1 = new Thread(task, "Worker-1");
        Thread worker2 = new Thread(task, "Worker-2");
        Thread worker3 = new Thread(task, "Worker-3");

        worker1.setPriority(Thread.MIN_PRIORITY);
        worker2.setPriority(Thread.NORM_PRIORITY);
        worker3.setPriority(Thread.MAX_PRIORITY);

        worker1.start();
        worker2.start();
        worker3.start();
    }
}