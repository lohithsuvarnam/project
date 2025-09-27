import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A obj=new A();
	static int m1(float a)
	{
		System.out.println(a);
		obj.m8();
		return sc.nextInt();
	}
	static String m2()
	{
		System.out.println("m2");
		return sc.next();
	}
	static void m3(int b)
	{
		System.out.println(b);
		System.out.println(m2());
	}
	static void m4()
	{
		System.out.println("m4");
		m3(sc.nextInt());
	}
	float m5(String c)
	{
		System.out.println(c);
		obj.m4();
		return sc.nextFloat();
	}
	boolean m6()
	{
		System.out.println("m6");
		System.out.println(obj.m5(sc.next()));
		return sc.nextBoolean();
	}
	void m7(int d)
	{
		System.out.println(d);
		System.out.println(obj.m6());
	}
	void m8()
	{
		System.out.println("m8");
		obj.m7(sc.nextInt());
	}
	public static void main(String[] args)
	{
		System.out.println(m1(sc.nextFloat()));
	}
}