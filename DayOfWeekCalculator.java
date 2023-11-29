import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeekCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input: day, month, year
        System.out.print("Enter day: ");
        int day = scanner.nextInt();

        System.out.print("Enter month: ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Check if the input date is valid
        if (isValidDate(day, month, year)) {
            // Calculate the day of the week
            String dayOfWeek = getDayOfWeek(day, month, year);

            // Display the result
            System.out.println("Day of the week: " + dayOfWeek);
        } else {
            System.out.println("Invalid date.");
        }

        // Close the scanner
        scanner.close();
    }

    private static boolean isValidDate(int day, int month, int year) {
        try {
            LocalDate.of(year, month, day);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private static String getDayOfWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }
}
