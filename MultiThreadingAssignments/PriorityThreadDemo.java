package Threadcontrolandpriorities;
public class PriorityThreadDemo {

    public static void main(String[] args) {

        Thread maxThread = new Thread(() -> {
            System.out.println("MAX Priority Thread Started");

            for (int i = 1; i <= 5; i++) {
                System.out.println("MAX: " + i);
            }

            System.out.println("MAX Priority Thread Completed");
        });

        Thread normalThread = new Thread(() -> {
            System.out.println("NORMAL Priority Thread Started");

            for (int i = 1; i <= 5; i++) {
                System.out.println("NORMAL: " + i);
            }

            System.out.println("NORMAL Priority Thread Completed");
        });

        Thread minThread = new Thread(() -> {
            System.out.println("MIN Priority Thread Started");

            for (int i = 1; i <= 5; i++) {
                System.out.println("MIN: " + i);
            }

            System.out.println("MIN Priority Thread Completed");
        });

        maxThread.setPriority(Thread.MAX_PRIORITY);
        normalThread.setPriority(Thread.NORM_PRIORITY);
        minThread.setPriority(Thread.MIN_PRIORITY);

        maxThread.start();
        normalThread.start();
        minThread.start();
    }
}