package Map;

import java.util.*;

public class PropertiesDemo {

    public static void main(String[] args) {

        Properties p = new Properties();

        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");

        Iterator<Object> itr = p.keySet().iterator();

        while (itr.hasNext()) {

            String state = (String) itr.next();

            System.out.println(state + " -> " + p.getProperty(state));
        }
    }
}