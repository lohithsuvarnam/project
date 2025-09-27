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
	public static void main(String[] args)
	{
		A x=new A(sc.nextInt(),sc.nextFloat());
		System.out.println(x.a);
		System.out.println(x.b);
	}
}