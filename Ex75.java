import java.util.*;
interface I1
{
	Scanner sc=new Scanner(System.in);
	default int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	long m2(double a);
	class A
	{
		short m3(float a)
		{
			System.out.println(a);
			return sc.nextShort();
		}
		float m4(long a)
		{
			System.out.println(a);
			return sc.nextFloat();
		}
	}
}
class Test implements I1
{
	Scanner sc=I1.sc;
	public long m2(double a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
		Scanner sc=I1.sc;
		Test x=new Test();
		System.out.println(x.m1(sc.nextFloat()));
		System.out.println(x.m2(sc.nextDouble()));
		I1.A y=new I1.A();
		System.out.println(y.m3(sc.nextFloat()));
		System.out.println(y.m4(sc.nextLong()));
	}
}
	