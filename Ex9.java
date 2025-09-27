import java.util.*;
class Ex9
{
	static Scanner sc=new Scanner(System.in);
	long m1(int a)
	{
		System.out.println(a);
		return sc.nextLong();
	}
	float m2(long b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
	boolean m3(float c)
	{
		System.out.println(c);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		Ex9 obj=new Ex9();
		long a=obj.m1(sc.nextInt());
		float b=obj.m2(a);
		System.out.println(obj.m3(b));
	}
}