package Threadcontrolandpriorities;

public class NumberThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);

            if (i == 5) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {

        NumberThread thread = new NumberThread();

        thread.start();
    }
}