
import java.util.Scanner;

public class NumberPlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            System.out.print("Enter a positive number: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                scanner.next(); // consume the invalid input
            }
            number = scanner.nextInt();
        } while (number <= 0);

        int result;

        if (number > 50) {
            result = calculateDigitDifference(number);
        } else {
            result = calculateDigitDifference(reverseNumber(number));
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    // Calculates the absolute difference between the last two digits of a number.
    public static int calculateDigitDifference(int number) 
     {
        int lastDigit = number % 10;
        int secondLastDigit = (number / 10) % 10;

        return Math.abs(lastDigit - secondLastDigit);
    }

    // Reverses the digits of a given number.
    public static int reverseNumber(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}


