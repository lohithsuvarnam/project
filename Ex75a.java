import java.util.*;
interface I
{
	static Scanner sc=new Scanner(System.in);
	char m1(String a);
	default int m2(long a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	class A
	{
		short m3(float a)
		{
			System.out.println(a);
			return sc.nextShort();
		}
		double m4(int a)
		{
			System.out.println(a);
			return sc.nextDouble();
		}
	}
}
class Test
{
	static Scanner sc=I.sc;
	public static void main(String[]args)
	{
		I x=new I()
		{
			public char m1(String a)
			{
				System.out.println(a);
				return sc.next().charAt(0);
			}
		};
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextLong()));
		I.A y =new I.A();
		System.out.println(y.m3(sc.nextFloat()));
		System.out.println(y.m4(sc.nextInt()));
	}
}