package Module3.synchronization;

class Buffer {
    int item;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();

        }

        item = value;
        System.out.println("Produced: "+ item);
        available = true;
        notify();

    }

    synchronized void consume() throws InterruptedException {
        while (!available) {
            wait();

        }
        System.out.println("Consumed: " + item);
        available = false;
        notify();

    }
}

class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer buffer) {
        this.buffer = buffer;

    }

    public void run() {
        try {
            for (int i =1; i<= 5; i++) {
                buffer.produce(i);
            }
        }
        catch (InterruptedException e) {

        }
    }
}

class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer buffer) {
        this.buffer = buffer;

    }
    public void run() {
        try {
            for (int i = 1; i<= 5; i++) {
                buffer.consume();

            }
        }
        catch (InterruptedException e) {

        }
    }
}


public class ProducerConsumer {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();

    }
}
