import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B extends A
{
	A y=new A();
	int a=sc.nextInt();
	long m2(double a)
	{
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(this.a);
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextDouble()));
	}
}