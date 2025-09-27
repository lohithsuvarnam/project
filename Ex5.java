import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1(String a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	long m2(short c)
	{
		System.out.println(c);
		System.out.println(m1(sc.next()));
		return sc.nextLong();
	}
	int m3(String e, double f)
	{
		System.out.println(e+" "+f);
		System.out.println(m2(sc.nextShort()));
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.m3(sc.next(),sc.nextDouble()));
	}
}
	