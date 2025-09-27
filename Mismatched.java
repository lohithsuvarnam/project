
import java.util.*;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		try
		{
			 n=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Exception Handeled");
		}
		System.out.println(n);
		System.out.println("Hello World");
	}

}
