
import java.util.*;
class A
{
	static Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	A(A x)
	{
		System.out.println(a);
		System.out.println(x.a);
	}
	A()
	{
		System.out.print("Ntg");
	}
	public static void main(String[] args)
	{
		A x=new A();
		A y=new A(x);
	}
}

	
	