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
	void m2(A obj)
	{
		System.out.println("m2");
		System.out.println(a);
		System.out.println(obj.a);
	}
	public static void main(String[] args)
	{
		System.out.println(m1(sc.next()));
		A x=new A();
		A y=new A();
		x.m2(y);
	}
}
		
