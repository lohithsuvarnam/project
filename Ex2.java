import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float b=sc.nextFloat();
	String m1(int c)
	{
		System.out.println(c);
		return sc.next();
	}
	double m2(float e,long f)
	{
		System.out.println(e);
		System.out.println(f);
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		System.out.println(a);
		A obj=new A();
		System.out.println(obj.b);
		int c=sc.nextInt();
		System.out.println(obj.m1(c));
		float e=sc.nextFloat();
		long f=sc.nextLong();
		System.out.println(obj.m2(e,f));
	}
}