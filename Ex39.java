import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	float m2(long b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
}
class B extends A
{
	static boolean m1(int a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	short m2(double b)
	{
		System.out.println(b);
		return sc.nextShort();
	}
}
class C extends A
{
	static float m1(long a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	String m2(int b)
	{
		System.out.println(b);
		return sc.next();
	}
}
class Test 
{
	public static void main(String[] args)
	{
		Scanner sc=A.sc;
		B x=new B();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextLong()));
		System.out.println(B.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextDouble()));
		C z=new C();
		System.out.println(C.m1(sc.nextLong()));
		System.out.println(z.m2(sc.nextInt()));
	}
}
		
	
	