import java.util.Scanner;

public class CountCompositeNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Prompt the user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Count the number of composite numbers in the array
        int count = countCompositeNumbers(array);

        // Print the result
        System.out.println("Number of Composite Numbers = " + count);

        // Close the Scanner
        scanner.close();
    }

    // Function to check if a number is composite
    private static boolean isComposite(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return true; // It is divisible by a number other than 1 and itself
            }
        }
        return false;
    }

    // Function to count the number of composite numbers in an array
    private static int countCompositeNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (isComposite(num)) {
                count++;
            }
        }
        return count;
    }
}
