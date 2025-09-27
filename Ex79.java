import java.util.*;
interface I
{
	Scanner sc=new Scanner(System.in);
	long m1(int a);
	default String m2(double a)
	{
		System.out.println(a);
		return sc.next();
	}
	abstract class A
	{
		abstract float m3(short a);
		A(boolean a)
		{
			System.out.println(a);
		}
		class B
		{
			double m4(byte a)
			{
				System.out.println(a);
				return sc.nextDouble();
			}
			long m5(String a)
			{
				System.out.println(a);
				return sc.nextLong();
			}
		}
	}
}
class C extends I.A implements I
{
	static Scanner sc=new Scanner(System.in);
	float m3(short a)
	{	
		System.out.println(a);
		return sc.nextFloat();
	}
	C()
	{
		super(sc.nextBoolean());
	}
	public long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	public static void main(String[] args)
	{
		C x=new C();
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.nextDouble()));
		System.out.println(x.m3(sc.nextShort()));
		I.A.B y=x.new B();
		System.out.println(y.m4(sc.nextByte()));
		System.out.println(y.m5(sc.next()));
			
	}
}

		