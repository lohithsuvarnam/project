import java.util.*;
abstract class A
{
	static Scanner sc=new Scanner(System.in);
	abstract long m1(String a);
	abstract double m2(int a);
}
class B extends A
{	
	long m1(String a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	double m2(int a)
	{
		System.out.println(a);
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextInt()));
	}
}
	