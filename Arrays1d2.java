package Arrays;

public class Arrays1d2 {
    public static void main(String[] args) {

        int[] a = new int[args.length];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
            sum += a[i];
        }

        double avg = (double) sum / args.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}