import java.util.*;
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=0;
		try
		{
			a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception Handeled");
		}
		System.out.print(a);
	}
}