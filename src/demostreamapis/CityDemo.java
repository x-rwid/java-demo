package demostreamapis;

import java.util.List;

public class CityDemo {
    static void main() {

        City andijan = new City("Andijan", 503_000);
        City fergana = new City("Fargona", 337_000);
        CityCountry uzbekistan = new CityCountry("Uzbekistan", List.of(andijan, fergana));

        City madrid = new City("Madrid", 683_000_000);
        City seville = new City("Iwbilya", 702_000);
        CityCountry spain = new CityCountry("Ispaniya",  List.of(madrid, seville));

        City marrakesh = new City("Marrokaw", 110_000_000);
        City casablanca = new City("Ad Dar Ul Bayzo", 445_000_000);
        CityCountry morocco = new CityCountry("Marokaw", List.of(marrakesh, casablanca));

        List<CityCountry> countries = List.of(uzbekistan,spain, morocco);

        int totalPopulation = 0;
        for (CityCountry country : countries) {
            for (City city : country.cities()) {
                totalPopulation += city.population();
            }
        }
        IO.println("Umumiy aholi = " + totalPopulation);
    }
}
