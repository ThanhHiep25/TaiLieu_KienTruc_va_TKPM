package ex1;

public class PrimeCheckTask implements Runnable {
    private int x;

    public PrimeCheckTask(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        if (isPrime(x)) {
            System.out.println(Thread.currentThread().getName() + ": " + x + " is a prime number.");
        } else {
            System.out.println(Thread.currentThread().getName() + ": " + x + " is not a prime number.");
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Numbers to be checked for primality
        int[] numbers = { 7, 14, 23, 30, 41 };

        // Create threads and start them
        for (int i = 0; i < numbers.length; i++) {
            Thread thread = new Thread(new PrimeCheckTask(numbers[i]), "Thread-" + (i + 1));
            thread.start();
        }
    }
}

