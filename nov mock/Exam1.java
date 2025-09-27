import java.util.*;
interface I1
{
	long m1(float a);
	String m2(double a);
	interface I2
	{
		float m3(long a);
	}
	interface I3
	{
		boolean m4(int a);
	}
}
class A implements I1
{
	static Scanner sc=new Scanner(System.in);
	public long m1(float a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public String m2(double a)
	{
		System.out.println(a);
		return sc.next();
	}
	
}
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		A z=new A();
		System.out.println(z.m1(sc.nextFloat()));
		System.out.println(z.m2(sc.nextDouble()));
		I1.I2 x=new I1.I2()
		{
			public float m3(long a)
			{
				System.out.println(a);
				return sc.nextFloat();
			}
		};
		System.out.println(x.m3(sc.nextLong()));
		I1.I3 y=(a)->
		{
			System.out.println(a);
			return sc.nextBoolean();
		};
		System.out.println(y.m4(sc.nextInt()));
	}
}

				