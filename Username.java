import java.util.*;
class Username{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);
		String x,y;
		System.out.println("Enter user name:");
		x=s.nextLine();
		System.out.println("Reenter user name:");
		y=s.nextLine();
		if(x.equals(y))
		{
			System.out.println("valid");
		}
		else{
			System.out.println(" not valid");}

}
}