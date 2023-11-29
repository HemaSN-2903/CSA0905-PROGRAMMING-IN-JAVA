import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of days from the user
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Calculate years, weeks, and days
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        // Display the result
        System.out.println("No. of years: " + years);
        System.out.println("No. of weeks: " + weeks);
        System.out.println("No. of days: " + days);

        // Close the scanner
        scanner.close();
    }
}
