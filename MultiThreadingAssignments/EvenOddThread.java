package Threadcontrolandpriorities;

public class EvenOddThread {

    public static void main(String[] args) {

        Thread evenThread = new Thread(() -> {

            for (int i = 2; i <= 20; i = i + 2) {
                System.out.println("Even: " + i);
            }
        });

        Thread oddThread = new Thread(() -> {

            for (int i = 1; i <= 20; i = i + 2) {
                System.out.println("Odd: " + i);
            }
        });

        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        oddThread.start();
    }
}