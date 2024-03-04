package ex1;

public class NumberDisplayTask implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }

    public static void main(String[] args) {
        // Create threads and start them
        for (int i = 1; i <= 5; i++) { // Creating 5 threads for demonstration
            Thread thread = new Thread(new NumberDisplayTask(), "Thread-" + i);
            thread.start();
        }
    }
}

