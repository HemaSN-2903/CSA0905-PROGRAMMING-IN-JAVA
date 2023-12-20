import java.util.Scanner;
public class Even_fibonnaci_day1
{
    public static int calculateEvenFibonacciSum(int n) 
    {
        if (n <= 0) 
        {
            return 0;
        }
        int a = 0, b = 1, sum = 0;
        for (int i = 2; i <= n; i++) 
        {
            int c = a + b;
            a = b;
            b = c;
            if (i % 2 == 0) 
            {
                sum += c;
            }
        }        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms: ");
        int n = scanner.nextInt();
        int sum = calculateEvenFibonacciSum(n);
        System.out.println("Sum of even indexed Fibonacci numbers up to " + n + " terms: " + sum);
    }
}