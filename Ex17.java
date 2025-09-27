import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	static A m1()
	{
		return new A();
	}
	int m2(int a)
	{
		System.out.println(sc.nextInt());
		return sc.nextInt();
	}
	public static void main(String[] args)
	{
		System.out.println(m1());
		System.out.println(m1().m2(sc.nextInt()));
	}
}