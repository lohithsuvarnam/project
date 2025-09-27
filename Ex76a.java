import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	String m1(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	A(int a)
	{
		System.out.println(a);
	}
	interface I
	{
		short m1(float a);
		float m2(double b);
		static long m3(int c)
		{
			System.out.println(c);
			return sc.nextLong();
		}
	}
}
class Test 
{
	static Scanner sc=A.sc;
	public static void main(String []args)
	{
		A x=new A(sc.nextInt());
		System.out.println(x.m1(sc.nextInt()));
		A.I y=new A.I()
		{
			public short m1(float a)
			{
				System.out.println(a);
				return sc.nextShort();
			}
			public float m2(double b)
			{
				System.out.println(b);
				return sc.nextFloat();
			}
		};
		System.out.println(I.m3(sc.nextInt()));
		
	}
}
