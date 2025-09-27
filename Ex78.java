import java.util.*;
interface I1
{
	Scanner sc=new Scanner(System.in);
	long m1(int a);
	default float m2(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	interface I2
	{
		double m3(String a);
		static long m4(short a)
		{
			System.out.println(a);
			return sc.nextLong();
		}
	}
}
class Test
{
	public static void main(String[] args)
	{
		Scanner sc=I1.sc;
		I1 x=(a)->
		{
			System.out.println(a);
			return sc.nextLong();
		};
		I1.I2 y=(a)->
		{
			System.out.println(a);
			return sc.nextDouble();
		};
		System.out.println(x.m1(sc.nextInt()));
		System.out.println(x.m2(sc.next()));
		System.out.println(y.m3(sc.next()));
		System.out.println(I1.I2.m4(sc.nextShort()));
	}

}
		
		