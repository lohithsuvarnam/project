import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	static long a=sc.nextInt();
	boolean b=sc.nextBoolean();
	abstract double m1(int a);
	abstract int m2(float a);
	boolean m3(String a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	long m4(short a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	A(String a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	double m1(int a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	int m2(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	B()
	{
		super(sc.next());
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(a);
		System.out.println(x.b);
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextFloat()));
		System.out.println(x.m3(sc.next()));
		System.out.println(x.m4(sc.nextShort()));
	}
}
	
	
	
	