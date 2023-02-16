package Task4;

import java.util.HashMap;
import java.util.Scanner;

public class CityFamilies {
    public static void main(String[] args) {
        HashMap<String, String> cityFamilies = new HashMap<>();

        cityFamilies.put("Москва", "Іванови");
        cityFamilies.put("Київ", "Петрови");
        cityFamilies.put("Лондон", "Абрамовичі");

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a city: ");
            String city = scanner.nextLine();

            if (cityFamilies.containsKey(city)) {
                System.out.println("The family living in " + city + " is " + cityFamilies.get(city));
            } else {
                System.out.println("No information available for the entered city.");
            }
        }
    }
}
