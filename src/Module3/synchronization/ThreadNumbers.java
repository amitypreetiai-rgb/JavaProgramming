package Module3.synchronization;

class Thread1 extends Thread {
    public void run() {
        for (int i=1; i<=10;i++) {
            System.out.println("Thread 1: " +i);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i=11; i<=20; i++) {
            System.out.println("Thread 2: " +i);
        }
    }
}


public class ThreadNumbers {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t1.join();
        t2.start();
    }
}
