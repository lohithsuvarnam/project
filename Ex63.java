import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	double m1(long a);
	default int m2(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
interface I2 extends I1
{
	float m3(boolean a);
	default short m4(long a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
}
abstract class A implements I2
{
	abstract int m5(float a);
	A(String a)
	{
		System.out.println(a);
	}
}
class B extends A
{
	public double m1(long a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	public float m3(boolean a)
	{
		System.out.println(a);
		return sc.nextFloat();
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
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m3(sc.nextBoolean()));
		System.out.println(x.m4(sc.nextLong()));
		System.out.println(x.m5(sc.nextFloat()));
	}
}
		
			