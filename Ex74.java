import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	A(String a)
	{
		System.out.println(a);
	}
	interface I
	{
		int m2(double a);
		float m3(short a);
		static long m4(int a)
		{
			System.out.println(a);
			return sc.nextLong();
		}
	}
}
class Test implements A.I
{
	static Scanner sc=A.sc;
	public int m2(double a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public float m3(short a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		Scanner sc=A.sc;
		A x=new A(sc.next());
		System.out.println(x.m1(sc.nextInt()));
		Test y=new Test();
		System.out.println(y.m2(sc.nextDouble()));
		System.out.println(y.m3(sc.nextShort()));
		System.out.println(A.I.m4(sc.nextInt()));
	}
}