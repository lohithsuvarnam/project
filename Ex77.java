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
class A implements I1,I1.I2,I1.I3
{
	static Scanner sc=I1.sc;
	public long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public boolean m3(double a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public String m4(short a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String[] args)
	{
		Scanner sc=I1.sc;
		A x=new A();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m3(sc.nextDouble()));
		System.out.println(x.m4(sc.nextShort()));
	}
}