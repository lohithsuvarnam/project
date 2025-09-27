import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a;
	float b;
	A(int c, float d)
	{
		int a=c;
		float b=d;
	}
	void display()
	{	
		System.out.println(a);
		System.out.println(b);
		System.out.println(x.a);
		System.out.println(x.b);
	}
	public static void main(String[] args)
	{	
		A x=new A(sc.nextInt(),sc.nextFloat());
		x.display();
	}
}