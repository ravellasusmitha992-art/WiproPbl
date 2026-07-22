package threadcreation;

public class HareTortoiseRaceC {

    static volatile boolean raceFinished = false;

    static class Race extends Thread {

        String animal;

        Race(String animal) {
            this.animal = animal;
        }

        public void run() {

            for (int i = 1; i <= 100; i++) {

                if (raceFinished) {
                    return;
                }

                System.out.println(animal + " ran " + i + " meters");

                if (animal.equals("Hare") && i == 60) {

                    System.out.println(
                        "Hare is sleeping for 1000 milliseconds"
                    );

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            raceFinished = true;
            System.out.println(animal + " wins the race!");
        }
    }

    public static void main(String[] args) {

        Race hare = new Race("Hare");
        Race tortoise = new Race("Tortoise");

        hare.start();
        tortoise.start();
    }
}