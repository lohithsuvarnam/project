import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(long a);
	default float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
}
abstract class A
{
	static Scanner sc=I1.sc;
	abstract short m3(double a);
	float m4(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	A(Boolean a)
	{
		System.out.println(a);
	}
 	public static void main(String[] args)
	{
		A x=new A(sc.nextBoolean())
		{
			short m3(double a)
			{
				System.out.println(a);
				return sc.nextShort();
			}
		};
		I1 y=new I1()
		{
			public int m1(long a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
		};
		System.out.println(y.m1(sc.nextLong()));
		System.out.println(y.m2(sc.next()));
		System.out.println(x.m3(sc.nextDouble()));
		System.out.println(x.m4(sc.nextInt()));
	}
}