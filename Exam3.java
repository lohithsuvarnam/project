import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("Default");
	}
	A(A x)
	{

	}
	float m1(boolean b)
	{
		System.out.println(b);
		return sc.nextFloat();
	}
	public static void main(String[] args)
	{
		new A(new A()).m1(sc.nextBoolean());
	}
}