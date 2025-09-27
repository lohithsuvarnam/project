import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	float m1(int a);
	default String m2(float a)
	{
		System.out.println(a);
		return sc.next();
	}
}
interface I2
{
	boolean m3(float a);
	default double m4(int a)
	{
		System.out.println(a);
		return I1.sc.nextDouble();
	}
}
abstract class A 
{
	static Scanner sc=new Scanner(System.in);
	abstract int m5(float a);
	short m6(long a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	A(String a)
	{
		System.out.println(a);
	}
}
class B extends A implements I1,I2
{
	static Scanner sc=new Scanner(System.in);
	public float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public boolean m3(float a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	int m5(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	B()
	{
		super(sc.next());
	}
}
class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		B x=new B();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextFloat()));
		System.out.println(x.m3(sc.nextFloat()));
		System.out.println(x.m4(sc.nextInt()));
		System.out.println(x.m5(sc.nextFloat()));
		System.out.println(x.m6(sc.nextLong()));
	}
}
	