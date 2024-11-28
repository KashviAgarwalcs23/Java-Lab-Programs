class Q {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        while (!valueSet) {
            try {
                System.out.println("\nConsumer waiting...");
                wait();  // Wait until the producer has produced an item.
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        // Consume the item
        System.out.println("Got: " + n);
        valueSet = false;

        // Notify the producer that the consumer is done consuming
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet) {
            try {
                System.out.println("\nProducer waiting...");
                wait();  // Wait until the consumer has consumed the item.
            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught");
            }
        }
        // Produce the item
        this.n = n;
        valueSet = true;
        System.out.println("Put: " + n);

        // Notify the consumer that the item is produced
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start(); // Start the producer thread
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start(); // Start the consumer thread
    }

    public void run() {
        int i = 0;
        while (i < 15) {
            int r = q.get();
            System.out.println("Consumed: " + r);
            i++;
        }
    }
}

public class PCFixed {
    public static void main(String args[]) {
        Q q = new Q(); // Shared resource between producer and consumer

        // Start producer and consumer
        new Producer(q);
        new Consumer(q);

        System.out.println("Press Control-C to stop.");
    }
}
