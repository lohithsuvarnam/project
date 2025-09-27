import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1(long a)
	{
		System.out.println(a);
		class B
		{	
			
			int m2(double a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
		}
		B y=new B();
		System.out.println(y.m2(sc.nextDouble()));
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.nextLong()));
	}
}