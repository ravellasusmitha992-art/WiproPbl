package StringStringbuffer;

public class RepeatLastN {
    public static void main(String[] args) {

        String str = "Wipro";
        int n = 3;

        String last = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            System.out.print(last);
        }
    }
}