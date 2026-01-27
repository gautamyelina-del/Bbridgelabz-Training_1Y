import java.util.Scanner;
class Divisible_5
{
  public static void main(String args[])
  {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter Number:");
	int number = input.nextInt();
	if (number%5 == 0)
	{
		System.out.println("Divided by 5");
	}
	else
	{
		System.out.println("Not divisible");
	}
  }
} 