import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
class B extends A
{ 
	A y=new A();
	float m1(String a)
	{
		System.out.println(a);
		System.out.println(y.m1(sc.next()));
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		B x=new B();
		System.out.println(x.m1(sc.next()));
	}
}