import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float a;
	String b;
	static float m1(int a)
	{
		System.out.println(a);
		return sc.nextFloat();
	}
	static String m2(int a)
	{
		System.out.println(a);
		return sc.next();
	}
	public static void main(String[] args)
	{
		float a=A.m1(sc.nextInt());
		String b=A.m2(sc.nextInt());
		System.out.println(a);
		System.out.println(b);
	}
}