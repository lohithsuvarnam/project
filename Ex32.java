import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int m1(String a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	double m1(short b)
	{
		System.out.println(b);
		System.out.println(this.m1(sc.next()));
		return sc.nextDouble();
	}
	void m1(float c)
	{
		System.out.println(c);
		System.out.println(this.m1(sc.nextShort()));
	}
	public static void main(String[] args)
	{
		A x=new A();
		x.m1(sc.nextFloat());
	}
}