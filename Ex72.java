import java.util.*;
interface A
{
	static Scanner sc = new Scanner (System.in);
	int M1 (float a);
	static String M2 (short a)
	{
		System.out.println(a);
		return sc.next();
	}
}
abstract class B 
{
	static Scanner sc = A.sc;
	abstract long M3 (char a);
	boolean M4 (String a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	B(int a)
	{
		System.out.println(a);
	}
	public static void main (String[]args)
	{
		
		B x = new B(sc.nextInt())
		{
			long M3 (char a)
			{
				System.out.println(a);
				return sc.nextLong();
			}
		};
		A y= new A()
		{
			public int M1 (float a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
		};
		System.out.println(y.M1(sc.nextFloat()));
		System.out.println(A.M2(sc.nextShort()));
		System.out.println(x.M3(sc.next().charAt(0)));
		System.out.println(x.M4(sc.next()));
	}
}