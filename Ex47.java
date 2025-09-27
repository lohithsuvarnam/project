import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	int m1(long a)
	{
		System.out.println(a);
		System.out.print(this.a);
		return sc.nextInt();
	}
	float m1(String a)
	{
		System.out.println(a);
		System.out.println(this.m1(sc.nextLong()));
		return sc.nextFloat();
	}
	A(double a)
	{
		System.out.println(a);
	}
	A(boolean a)
	{
		this(sc.nextDouble());
		System.out.println(a);
	}
}
class B extends A
{
	boolean a=sc.nextBoolean();
	float m1(String a)
	{
		System.out.println(a);
		System.out.println(super.m1(sc.next()));
		return sc.nextFloat();
	}
	B(int b)
	{
		super(sc.nextBoolean());
		System.out.println(a);
		System.out.println(super.a);
		System.out.println(b);
	}
	public static void main(String[] args)	
	{
		B x= new B(sc.nextInt());
		System.out.println(x.m1(sc.next()));
	}
}
		
		