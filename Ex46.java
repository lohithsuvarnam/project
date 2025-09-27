import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	long a=sc.nextLong();
	float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	A(double a)
	{
		System.out.println(a);
	}
	A()
	{
		System.out.println("default");
	}	
}
class B extends A
{
	A y=new A(sc.nextDouble());
	String a=sc.next();
	float m1(int a)
	{
		System.out.println(a);
		System.out.println(y.m1(sc.nextInt()));
		return sc.nextFloat();
	}
	B(boolean b)
	{
		System.out.println(a);
		System.out.println(y.a);
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		B x= new B(sc.nextBoolean());
		System.out.println(x.m1(sc.nextInt()));
	}
}
		