import java.util.*;
class A
{
	static Scanner sc = new Scanner(System.in);
	int a;
	String b;
	
	A(int c, String d)
	{
		a=c;
		b=d;
		
	}
	void display(A obj)
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println(obj.b);

		
	}
	A()
	{
	
	}
	public static void main(String[]args)
	{
		
		A y = new A(sc.nextInt(),sc.next());
		A x = new A();
		y.display(x);
	}
}