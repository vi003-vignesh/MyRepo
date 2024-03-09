
import java.util.Scanner;

public class NumberNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = scanner.nextInt();

        String result = convertToNumberNames(number);
        System.out.println(result);

        scanner.close();
    }

    private static String convertToNumberNames(int number) {
        String[] numberNames = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        String result = "";

        // Convert each digit to its corresponding name
        do {
            int digit = number % 10;
            result = numberNames[digit] + " " + result;
            number /= 10;
        } while (number > 0);

        return result.trim(); // Trim to remove trailing whitespace
    }
}


