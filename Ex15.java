import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	static float b=sc.nextFloat();
	String c=sc.next();
	boolean d=sc.nextBoolean();
	static int m1(float e)
	{
		System.out.println(e);
		System.out.println(new A().m4(sc.next()));
		System.out.println(a);
		System.out.println(b);
		System.out.println(new A().c);
		System.out.println(new A().d);
		return sc.nextInt();
	}
	static float m2(String f)
	{
		System.out.println(f);
		System.out.println(new A().m5(sc.nextBoolean()));
		System.out.println(a);
		System.out.println(b);
		System.out.println(new A().c);
		System.out.println(new A().d);
		return sc.nextFloat();
	}
	static boolean m3(int g)
	{
		System.out.println(g);
		System.out.println(new A().m6(sc.nextFloat()));
		System.out.println(a);
		System.out.println(b);
		System.out.println(new A().c);
		System.out.println(new A().d);
		return sc.nextBoolean();
	}
	int m4(String h)
	{
		System.out.println(h);
		return sc.nextInt();
	}
	float m5(boolean i)
	{
		System.out.println(i);
		return sc.nextFloat();
	}
	String m6(float j)
	{
		System.out.println(j);
		return sc.next();
	}
	public static void main(String[] args)
	{
		System.out.println(m1(sc.nextFloat()));
		System.out.println(m2(sc.next()));
		System.out.println(m3(sc.nextInt()));
	}
}
 