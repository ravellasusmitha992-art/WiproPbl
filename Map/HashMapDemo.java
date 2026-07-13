package Map;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("101", "Rahul");
        map.put("102", "Priya");
        map.put("103", "Kiran");

        System.out.println("Key exists : " + map.containsKey("101"));
        System.out.println("Value exists : " + map.containsValue("Priya"));

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}