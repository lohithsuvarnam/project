import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float b=sc.nextFloat();
	String m1(int c)
	{
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		return sc.next();
	}
	A()
	{
		System.out.println("Default");
	}
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.print(obj.m1(sc.nextInt()));
	}
}