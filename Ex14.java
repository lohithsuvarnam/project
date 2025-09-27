import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A m1(float a)
	{
		System.out.println(a);
		return new A();
	}
	String m2(boolean b)
	{
		System.out.println(b);
		return sc.next();
	}
	public static void main(String[] args)
	{
		System.out.println(m1(sc.nextFloat()).m2(sc.nextBoolean()));
	}
}
		