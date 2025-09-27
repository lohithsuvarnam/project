import java.util.*;
interface I1
{
	static Scanner sc=new Scanner(System.in);
	int m1(long a);
	String m2(double a);
}
class A implements I1
{
	public int m1(long a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	public String m2(double a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.nextLong()));
		System.out.println(x.m2(sc.nextDouble()));
	}
}