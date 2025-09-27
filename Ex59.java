import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract long m1(int a);
	double m2(String a)
	{
		System.out.println(a);		
		return sc.nextDouble();
	}
	
}
abstract class B extends A
{
	abstract float m3(short a);
	B(boolean a)
	{
		System.out.println(a);
	}
}
class C extends B
{	
	long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	float m3(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	C()
	{
		super(sc.nextBoolean());
	}
}
class D extends B
{
	long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	float m3(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	D()
	{
		super(sc.nextBoolean());
	}
}
class E
{
	
	static int m4(float a)
	{
		System.out.println(a);
		return A.sc.nextInt();
	}
	short m5(String a)
	{
		System.out.println(a);
		return A.sc.nextShort();
	}
	E(int a)
	{
		System.out.println(a);
	}
}
class Test
{
	static Scanner sc=A.sc;
	public static void main(String[] args)
	{
		invoke();
	}
	static void invoke()
	{
		C x=new C();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m3(sc.nextShort()));
		System.out.println(x.m2(sc.next()));
		D y=new D();
		System.out.println(y.m1(sc.nextInt()));
		System.out.println(y.m3(sc.nextShort()));
		E z=new E(sc.nextInt());
		System.out.println(E.m4(sc.nextFloat()));
		System.out.println(z.m5(sc.next()));
	}
}
		

	