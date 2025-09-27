import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			System.out.print(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception Handeled");
		}
	}
}