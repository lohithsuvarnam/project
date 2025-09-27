import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);	
	int a;
	float b;
	A(int c,float d)
	{
		a=c;
		b=d;
	}
	A(A obj)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(obj.a);
		System.out.println(obj.b);
	}
	public static void main(String[] args)
	{
		A x=new A(sc.nextInt(),sc.nextFloat());
		A y=new A(x);
	}
}
	
	