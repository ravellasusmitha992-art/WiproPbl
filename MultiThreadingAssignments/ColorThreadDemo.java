package threadcreation;

import java.util.Random;

public class ColorThreadDemo implements Runnable {

    String[] colours = {
        "white", "blue", "black",
        "green", "red", "yellow"
    };

    @Override
    public void run() {

        Random random = new Random();

        while (true) {

            int index = random.nextInt(colours.length);

            System.out.println(colours[index]);

            if (colours[index].equals("red")) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        ColorThreadDemo obj = new ColorThreadDemo();

        Thread thread = new Thread(obj);

        thread.start();
    }
}