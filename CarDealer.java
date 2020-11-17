import java.util.*;
public class CarDealer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        HashMap <String, String> carDealer = new HashMap<>();

        carDealer.put("Civic", "Honda");
        carDealer.put("Ford", "Bronco");
        carDealer.put("Jeep", "Cherokee");
        carDealer.put("Kia", "Forte");
        carDealer.put("Lexus", "GS");

        System.out.println("Hello. What car are you looking for?");
        String model = input.next();

        if (carDealer.containsKey(model)){
            System.out.println("Oh, you are looking for " + model + "? Our " + carDealer.get(model) + " selection is right over there.");
        }
        else
            System.out.println("Sorry, we do not have that.");
    }
    
}
