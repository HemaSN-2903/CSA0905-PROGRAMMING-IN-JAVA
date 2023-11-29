import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input: the given number and n
        System.out.print("Given Number: ");
        int number = scanner.nextInt();

        System.out.print("N: ");
        int n = scanner.nextInt();

        // Calculate and print the number of factors
        int numberOfFactors = calculateNumberOfFactors(number);
        System.out.println("Number of factors = " + numberOfFactors);

        // Print the nth factor
        int nthFactor = getNthFactor(number, n);
        System.out.println(n + "th factor of " + number + " = " + nthFactor);

        // Close the scanner
        scanner.close();
    }

    private static int calculateNumberOfFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }

    private static int getNthFactor(int number, int n) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
                if (count == n) {
                    return i;
                }
            }
        }
        // If n is out of bounds, return -1 or handle accordingly
        return -1;
    }
}
