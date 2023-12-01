import java.util.Scanner;

public class Binaryconverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        // Convert the decimal to binary and reverse the binary representation
        int reversedBinary = reverseBinary(decimalToBinary(decimal));

        // Print the result
        System.out.println("Reversed Binary: " + reversedBinary);

        // Close the Scanner
        scanner.close();
    }

    // Function to convert decimal to binary without using inbuilt functions
    private static String decimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }

        return binary.toString();
    }

    // Function to reverse the binary representation without using inbuilt functions
    private static int reverseBinary(String binary) {
        int reversedBinary = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            int bit = Character.getNumericValue(binary.charAt(i));
            reversedBinary += bit * Math.pow(2, length - i - 1);
        }

        return reversedBinary;
    }
}
