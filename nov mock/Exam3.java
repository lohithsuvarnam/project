import java.util.*;
interface I1
{
	Scanner sc=new Scanner(System.in);
	default int m1(long a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	short m2(double a);
}
interface I2
{
	Scanner sc=I1.sc;
	default String m3(float a)
	{
		System.out.println(a);
		return sc.next();
	}
	int m4(boolean a);
}
abstract class A
{
	static Scanner sc=I1.sc;
	abstract float m5(short a);
	A(String a)
	{
		System.out.println(a);
	}
}
abstract class B
{
	static Scanner sc=I1.sc;
	abstract double m6(int a);
	B(boolean a)
	{
		System.out.println(a);
	}
}
class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=I1.sc;
		B x1=new B(sc.nextBoolean())
		{
			double m6(int a)
			{
				System.out.println(a);
				return sc.nextDouble();
			}
		};
		System.out.println(x1.m6(sc.nextInt()));
		A x2=new A(sc.next())
		{
			float m5(short a)
			{
				System.out.println(a);
				return sc.nextFloat();
			}
		};
		System.out.println(x2.m5(sc.nextShort()));
		I1 x3=new I1()
		{
			public short m2(double a)
			{
				System.out.println(a);
				return sc.nextShort();
			}
		};
		System.out.println(x3.m1(sc.nextLong()));
		System.out.println(x3.m2(sc.nextDouble()));
		I2 x4=new I2()
		{
			public int m4(boolean a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
		};
		System.out.println(x4.m3(sc.nextFloat()));
		System.out.println(x4.m4(sc.nextBoolean()));
		
	}
}
		
	