import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract float m1(long a);
	int m2(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	A(boolean a)
	{
		System.out.println(a);
	}
}
abstract class B extends A

{
	abstract short m3(int a);
	abstract double m4(boolean a);
	B()
	{
		super(sc.nextBoolean())                                                ;
	}
}
class C extends A
{
	short m3(int a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	double m4(boolean a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	float m1(long a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	C()
	{
		super(sc.nextBoolean());
	}
	public static void main(String[] args)
	{
		C x=new C();
		System.out.println(x.m3(sc.nextInt()));
		System.out.println(x.m4(sc.nextBoolean()));
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m2(sc.next()));
	}
}
	