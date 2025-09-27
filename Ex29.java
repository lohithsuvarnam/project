import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
	}
	A(A obj)
	{
	}
	A(A obj,int a)
	{
		System.out.print(a);
	}
	public static void main(String[] args)
	{
		new A(new A(new A()),sc.nextInt());
	}
}