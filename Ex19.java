import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A obj=new A();
	int a=sc.nextInt();
	float b=sc.nextFloat();
	String c=sc.next();
	void m1(float d, boolean e)
	{
		System.out.println(d);
		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	static boolean m2(String f)
	{
		System.out.println(f);
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		obj.m1(sc.nextFloat(),sc.nextBoolean());
		System.out.println(m2(sc.next()));
	}
} 