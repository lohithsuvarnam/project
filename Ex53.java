import java.util.*;
class A                                                                                                                              
{
	static Scanner sc=new Scanner(System.in);
	String m1(double a)
	{
		System.out.println(a);
		return sc.next();
	}
}
class B extends A
{
	String m1(double a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String[] args)
	{
		//A y=new A();
		//System.out.println(y.m1(sc.nextDouble()));
		B x=new B();
		System.out.println(x.m1(sc.nextDouble()));
	}
}
	