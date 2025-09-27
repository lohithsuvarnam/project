import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static int a=sc.nextInt();
	float b=sc.nextFloat();
	double m1(String c)
	{
		System.out.println(c);
		System.out.println(a);
		System.out.println(this.b);
		//System.out.println(this);
		return sc.nextDouble();
	}
	public static void main(String[] args)
	{
		A x=new A();
		System.out.println(x.m1(sc.next()));
		//System.out.println(x);
	}
}