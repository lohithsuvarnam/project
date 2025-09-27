import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float m1()
	{
		return sc.nextFloat();
	}
	boolean m2(float a)
	{
		System.out.println(a);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.print(x.m1());
		float b=x.m1();
		System.out.print(x.m2(b));
	}
}