package Arrays;
public class Arrays1d7 {

    public static void main(String[] args) {

        int[] a = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < a.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}