import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	void m1(int a,int b)
	{
		try
		{
			System.out.print(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception Handeled");
		}
	}
	void m2()
	{
		int a=0;
		try
		{
			a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			String s=sc.next();
			System.out.print(s);
			System.out.print("Exception Handeled");
		}
		System.out.print(a);
	}
	public static void main(String[] args)
	{
		A x=new A();
		x.m2();
		x.m1(sc.nextInt(),sc.nextInt());
	}
}

		