
import java.util.Scanner;

public class OxygenPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Room floor area
        System.out.print("Enter the floor area of the room (in square meters): ");
        double floorArea = scanner.nextDouble();

        // Calculate the number of plants
        int numberOfPlants = calculateNumberOfPlants(floorArea);

        // Calculate total oxygen production
        double totalOxygenProduction = calculateOxygenProduction(numberOfPlants);

        // Output results
        System.out.println("Number of plants needed: " + numberOfPlants);
        System.out.println("Total oxygen production per day: " + totalOxygenProduction + " litres");
    }

    // Function to calculate the number of plants
    public static int calculateNumberOfPlants(double floorArea) {
        int plantsPerSquareMeter = 10;
        int roundedPlants = (int) Math.floor(floorArea * plantsPerSquareMeter / 10) * 10;
        return roundedPlants;
    }

    // Function to calculate total oxygen production
    public static double calculateOxygenProduction(int numberOfPlants) {
        double oxygenPerPlant = 0.9;
        return numberOfPlants * oxygenPerPlant;
    }
}

