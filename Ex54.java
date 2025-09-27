import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	double m1(String a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	float m1(int a)
	{
		System.out.println(a);
		System.out.println(m1(sc.next()));
		return sc.nextFloat();
	}
}
class B extends A
{
	float m1(int a)
	{
		System.out.println(a);
		System.out.println(super.m1(sc.nextInt()));
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m1(sc.nextInt()));
	}
}