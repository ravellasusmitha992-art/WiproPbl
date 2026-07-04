package Arrays;

public class Arrays1d3 {

    public static void main(String[] args) {

        int[] a = {1, 4, 34, 56, 7};
        int search = Integer.parseInt(args[0]);

        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == search) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}