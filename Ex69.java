import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static long m1(float a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	double m2(short a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	class B
	{
		int m3(String a)
		{
			System.out.println(a);
			return sc.nextInt();
		}
	}
	static class C
	{
		float m4(boolean a)
		{
			System.out.println(a);
			return sc.nextFloat();
		}
		static long m5(double a)
		{
			System.out.println(a);
			return sc.nextLong();
		}
		class D
		{
			float m6(int a)
			{
				System.out.println(a);
				return sc.nextFloat();
			}
		}
	}
}
class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=A.sc;
		A x=new A();
		System.out.println(A.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextShort()));
		A.B x1=x.new B();
		System.out.println(x1.m3(sc.next()));
		A.C x2=new A.C();
		System.out.println(x2.m4(sc.nextBoolean()));
		System.out.println(A.C.m5(sc.nextDouble()));
		A.C.D x3=x2.new D();
		System.out.println(x3.m6(sc.nextInt()));
	}
}
			