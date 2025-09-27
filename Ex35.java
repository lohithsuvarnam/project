import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	static float m1(String a)
	{
		System.out.println(a);	
		return sc.nextFloat();
	}
	short m2(boolean b)
	{
		System.out.println(b);
		System.out.println(this.a);
		return sc.nextShort();
	}
}
class B extends A
{
	double a=sc.nextDouble();
	int m1(long a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		System.out.println(A.m1(sc.next()));
		B x=new B();
		System.out.println(x.m2(sc.nextBoolean()));
		System.out.println(x.m1(sc.nextLong()));
	}
}
		
		
		
		
		
	
	