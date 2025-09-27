import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A m1(A x)
	{
		x.m2(sc.nextInt(),sc.nextBoolean(),sc.next());
		return new A();
	}
	void m2(int a,boolean b,String c)
	{
		System.out.print(a+" "+b+" "+c);
	}
	public static void main(String[] args)
	{
		A x=new A();
		m1(new A());
	}
}
			
