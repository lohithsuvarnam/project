import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	A()
	{
		System.out.println("Default");
	}
	A(int a)
	{
		System.out.println(a);
	}
	A(float b)
	{
		System.out.print(b);
	}
	public static void main(String[] args)
	{
		new A(new A(new A().sc.nextInt()).sc.nextFloat());
	}
}
