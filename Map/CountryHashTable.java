package Map;

import java.util.*;

public class CountryHashTable {

    Hashtable<String, String> H1 = new Hashtable<>();

    public Hashtable<String, String> saveCountryCapital(String countryName, String capital) {
        H1.put(countryName, capital);
        return H1;
    }

    public String getCapital(String countryName) {
        return H1.get(countryName);
    }

    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : H1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }

    public Hashtable<String, String> swapKeyValue() {

        Hashtable<String, String> H2 = new Hashtable<>();

        for (Map.Entry<String, String> entry : H1.entrySet()) {
            H2.put(entry.getValue(), entry.getKey());
        }

        return H2;
    }

    public ArrayList<String> toArrayList() {
        return new ArrayList<>(H1.keySet());
    }

    public static void main(String[] args) {

        CountryHashTable obj = new CountryHashTable();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");

        System.out.println("Capital : " + obj.getCapital("India"));
        System.out.println("Country : " + obj.getCountry("Tokyo"));
        System.out.println("Swapped Map : " + obj.swapKeyValue());
        System.out.println("Countries : " + obj.toArrayList());
    }
}