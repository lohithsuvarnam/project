import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1(long a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B extends A
{
	short m1(double a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
}
class C extends B
{
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class D extends C
{
	long m1(short a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
}
class E extends C
{
	int m1(float a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
}
class F 
{
	public static void main(String[] args)
	{	
		Scanner sc=A.sc;
		D x=new D();
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m1(sc.nextDouble()));
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m1(sc.nextShort()));
		E y=new E();
		System.out.println(y.m1(sc.nextFloat()));
	}
}
		
		


	
	