
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	long m1(float a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
}
class B extends A
{
	String m2(int a)
	{
		System.out.println(a);
		System.out.println(m1(sc.nextFloat()));
		return sc.next();
	}
}
class C
{
	B x=new B();
	double m3(short a)
	{
		System.out.println(a);
		System.out.println(x.m2(A.sc.nextInt()));
		return A.sc.nextDouble();
	}
}
class D
{
	public static void main(String[] args)
	{
		Scanner sc=A.sc;
		C y=new C();
		System.out.println(y.m3(sc.nextShort()));
	}
}