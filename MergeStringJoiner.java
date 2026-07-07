package StringJoiner;

import java.util.StringJoiner;

public class MergeStringJoiner {
    public static void main(String[] args) {

        StringJoiner s1 = new StringJoiner("-");
        s1.add("Hyderabad");
        s1.add("Chennai");
        s1.add("Delhi");

        StringJoiner s2 = new StringJoiner("-");
        s2.add("Mumbai");
        s2.add("Pune");
        s2.add("Bangalore");

        
        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("Mumbai").add("Pune").add("Bangalore");
        sj1.merge(s1);
        System.out.println("s1 merged to s2: " + sj1);

       
        StringJoiner sj2 = new StringJoiner("-");
        sj2.add("Hyderabad").add("Chennai").add("Delhi");
        sj2.merge(s2);
        System.out.println("s2 merged to s1: " + sj2);
    }
}