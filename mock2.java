import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	String m1(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.next();
	}
	float m2(boolean a)
	{
		System.out.println(a);
		System.out.println(this.m1(sc.nextInt()));
		return sc.nextFloat();
	}
	A(double a)
	{
		System.out.println(a);
	}
	A(String a)
	{
		this(sc.nextDouble());
		System.out.println(a);
	}
}
class B extends A
{
	short a=sc.nextShort();
	float m2(boolean a)
	{
		System.out.println(a);
		System.out.println(super.m2(sc.nextBoolean()));
		return sc.nextFloat();
	}
	B()
	{
		super(sc.next());
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m2(sc.nextBoolean()));
	}
}