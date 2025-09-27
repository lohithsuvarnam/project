import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	A(float a)
	{
		System.out.println(a);
		System.out.println(this.a);
	}
	A(String b)
	{
		this(sc.nextFloat());
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		new A(sc.next());
	}
}
	
	