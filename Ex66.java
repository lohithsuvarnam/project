import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	private int b=sc.nextInt();
	static long m1(short a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	double m2(float a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	class B
	{
		char m3(int a)
		{
			System.out.println(b);
			System.out.println(a);
			return sc.next().charAt(0);
		}
	}
	class C
	{
		int m4(float a)
		{
			System.out.println(a);
			return sc.nextInt();
		}
		class D
		{
			float m5(long a)
			{
				System.out.println(a);	
				return sc.nextFloat();
			}
			long m6(double a)
			{
				System.out.println(a);
				return sc.nextLong();
			}
		}
	}
}
class Test
{
	public static void main(String []args)
	{
		Scanner sc=A.sc;
		A x=new A();
		System.out.println(A.m1(sc.nextShort()));
		System.out.println(x.m2(sc.nextFloat()));
		A.B x1=x.new B();
		System.out.println(x1.m3(sc.nextInt()));
		A.C x2=x.new C();
		System.out.println(x2.m4(sc.nextFloat()));
		A.C.D x3=x2.new D();
		System.out.println(x3.m5(sc.nextLong()));
		System.out.println(x3.m6(sc.nextDouble()));
	}
}