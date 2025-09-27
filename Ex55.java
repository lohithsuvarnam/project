import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("hi");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		System.out.println("hello");
		A.main(args);
	}
}