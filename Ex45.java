import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	A(int a)
	{
		System.out.println(a);
	}
	A()
	{
		System.out.print("default");	
	}
}
class B extends A
{
	String a=sc.next();
	B(double a)
	{
		super(sc.nextInt());
		System.out.println(super.a);
		System.out.println(a);
	}
	public static void main(String[] args)
	{
		B x=new B(sc.nextDouble());
		System.out.println(x.a);

	}
}