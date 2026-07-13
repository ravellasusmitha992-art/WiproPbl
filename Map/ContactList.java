package Map;

import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Rahul", 987654321);
        contacts.put("Priya", 987654322);
        contacts.put("Kiran", 987654323);

        System.out.println("Key Exists : " + contacts.containsKey("Rahul"));
        System.out.println("Value Exists : " + contacts.containsValue(987654322));

        Iterator<Map.Entry<String, Integer>> itr = contacts.entrySet().iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}