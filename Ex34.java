import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextFloat();
	}
	boolean m1(int a)
	{
		System.out.println(a);
		System.out.println(this.m1(sc.next()));
		return sc.nextBoolean();
	}
	A(float a)
	{
		System.out.println(a);
	}
	A()
	{
		this(sc.nextFloat());
		System.out.println("DEfault");
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.nextInt()));
	}
}