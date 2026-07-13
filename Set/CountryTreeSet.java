package Set;

import java.util.TreeSet;

public class CountryTreeSet {

    TreeSet<String> countries = new TreeSet<>();

    public TreeSet<String> saveCountryNames(String countryName) {

        countries.add(countryName);

        return countries;
    }

    public String getCountry(String countryName) {

        for(String country : countries) {

            if(country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }

        return null;
    }

    public static void main(String[] args) {

        CountryTreeSet obj = new CountryTreeSet();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println(obj.getCountry("Japan"));
        System.out.println(obj.getCountry("Canada"));
    }
}