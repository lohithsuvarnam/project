import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float b=sc.nextFloat();
	float m1(boolean c)
	{
		System.out.println(c);
		float d=sc.nextFloat();
		return d;
	}
	void m2(int e, long f)
	{
		System.out.println(e+" "+f);
	}
	static boolean m3(short g)
	{
		System.out.println(g);
		boolean h=sc.nextBoolean();
		return h;
	}
	public static void main(String[] args)
	{
		A obj=new A();
		System.out.println(obj.a);
		System.out.println(obj.b);
		boolean c=sc.nextBoolean();
		System.out.println(obj.m1(c));
		int e=sc.nextInt();
		long f=sc.nextLong();
		obj.m2(e,f);
		short g=sc.nextShort();
		System.out.println(A.m3(g));
	}
}