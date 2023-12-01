import java.util.*;
public class GCD{
  public static void main(String[] args) {

    int n1, n2 , gcd = 1;
    Scanner s=new Scanner(System.in);
    System.out.println("enter n1:");
    n1=s.nextInt();
    System.out.println("enter n2:");
    n2=s.nextInt();



    for(int i = 1; i <= n1 && i <= n2; ++i) {
      // Checks if i is factor of both integers
      if(n1 % i == 0 && n2 % i == 0)
        gcd = i;
    }

    int lcm = (n1 * n2) / gcd;
    System.out.printf("The GCD of %d and %d is %d.", n1, n2, gcd);
    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
}
