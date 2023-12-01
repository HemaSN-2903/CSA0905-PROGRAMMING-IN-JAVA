import java.util.Scanner;

public class EvenSumFibonacci {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Calculate and print the even sum of the Fibonacci series
        int evenSum = calculateEvenSumFibonacci(n);
        System.out.println("Even Sum of Fibonacci Series: " + evenSum);

        // Close the Scanner
        scanner.close();
    }

    // Function to calculate even sum of Fibonacci series up to term N
    private static int calculateEvenSumFibonacci(int n) {
        int sum = 0;
        int a = 0, b = 1;

        for (int i = 0; i <= n; i++) {
            // Add the value at even indexes to the sum
            if (i % 2 == 0) {
                sum += a;
            }

            // Calculate the next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }
}
