import java.util.Scanner;
public class input
{
	public static void main(String args[])
	{
		System.out.println("Enter input from the user");
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=input.nextInt();
		System.out.println("Enter second number");
		int b=input.nextInt();
		int sum=a+b;
		System.out.println(sum);
	}
}



