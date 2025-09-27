import java.util.*;
interface I1
{
	Scanner sc=new Scanner(System.in);
	long m1(int a);
	default float m2(String a)
	{
		System.out.println(a);	
		return sc.nextFloat();
	}
	interface I2
	{
		boolean m3(double a);
	}
	interface I3
	{
		String m4(short a);
	}
}
class A
{
	static Scanner sc=I1.sc;
	public static void main(String[] args)
	{
		I1 x=new I1()
		{
			public long m1(int a)
			{
				System.out.println(a);
				return sc.nextLong();	
			}
		};
		I1.I2 y=new I1.I2()
		{
			public boolean m3(double a)
			{
				System.out.println(a);
				return sc.nextBoolean();
			}
		};
		I1.I3 z=new I1.I3()
		{
			public String m4(short a)
			{
				System.out.println(a);
				return sc.next();
			}
		};
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.next()));
		System.out.println(y.m3(sc.nextDouble()));
		System.out.println(z.m4(sc.nextShort()));
	}
}
