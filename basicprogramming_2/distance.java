import java.util.Scanner;
class kilometer_to_miles
{
	 public static void main(String args[])
	 {
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in km:");
		int k = input.nextInt();
		double m = k*1.6;
		System.out.println("the distance in miles:"+m);
	 }
}
