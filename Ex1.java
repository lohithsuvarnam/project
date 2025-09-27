import java.util.Scanner;
class A
{
	static Scanner sc=new Scanner(System.in);
	void m1(String a)
	{
		System.out.println(a);
	}
	long m2(float b)
	{
		System.out.println(b);
		return sc.nextLong();

	}
	public static void main(String[] args)
	{
		A obj=new A();
		obj.m1(sc.next());
		System.out.println(obj.m2(sc.nextFloat()));
		
	}
}
	