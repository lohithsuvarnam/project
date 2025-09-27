import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	float m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextFloat();
	}
	boolean m2(int b)
	{
		System.out.println(b);
		return sc.nextBoolean();
	}
} 
class B extends A
{
	boolean a=sc.nextBoolean();
	static short m1(int a)
	{
		System.out.println(a);
		return sc.nextShort();
	}
	String m2(String b)
	{
		System.out.println(b);
		System.out.println(this.a);
		return sc.next();
	}
}
class C extends B
{
	float a=sc.nextFloat()	;
	int m1(long a)
	{
		System.out.println(a);
		System.out.println(this.a);
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		C x=new C();
		System.out.println(x.m1(sc.next()));
		System.out.println(x.m2(sc.nextInt()));
		System.out.println(B.m1(sc.nextInt()));
		System.out.println(x.m2(sc.next()));
		System.out.println(x.m1(sc.nextLong()));
	}
}
	