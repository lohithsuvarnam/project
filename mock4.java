import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static String a=sc.next();
	float b=sc.nextFloat();
	long m1(double a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	A(boolean a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	
	long m1(double a)
	{
		System.out.println(a);
		System.out.println(super.m1(sc.nextDouble()));
		return sc.nextLong();
	}
	short m2(float a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	B()
	{
		super(sc.nextBoolean());
		System.out.println(a);
		System.out.println(super.b);
	}
	public static void main(String[] args)
	{
		Scanner sc=A.sc;
		B y=new B();
		System.out.println(y.m1(sc.nextDouble()));
		System.out.println(y.m2(sc.nextFloat()));
	}
}