import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	float a=sc.nextFloat();
	void m1(String a)
	{
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		A x=new A();
		x.m1(sc.next());
	}
}