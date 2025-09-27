import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A x=new A();
	void m1()
	{
		System.out.println("m1");
	}
	static void m2(String a)
	{
		System.out.println(a);
		x.m1();
	}
	char m3()
	{
		m2(sc.next());
		return sc.next().charAt(0);
	}
	static double m4(int b,boolean c)
	{
		System.out.println(b+" "+c);
		System.out.println(x.m3());
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		System.out.println(m4(sc.nextInt(),sc.nextBoolean()));
	}
}