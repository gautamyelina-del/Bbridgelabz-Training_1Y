import java.util.Scanner;
class sam
{
	 public static void main(String args[])
	 {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter math number");
		 int a = input.nextInt();
		 System.out.println("Enter physics number");
		 int b = input.nextInt();
		 System.out.println("Enter chemistry number");
		 int c = input.nextInt();
		 int average = (a+b+c)/3;
		 System.out.println("Average marks"+average);
	 }
}
		 