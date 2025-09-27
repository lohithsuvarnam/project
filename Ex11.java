
import java.util.*;
class Maths
{
	static Scanner sc=new Scanner(System.in);
	int add(int a,int b)
	{
		return a+b;
	}
	int sub(int c,int d)
	{
		return c-d;
	}
	static int multiply()
	{
		Maths obj=new Maths();
		int e=obj.add(sc.nextInt(),sc.nextInt());
		int f=obj.sub(sc.nextInt(),sc.nextInt());
		return e*f;
	}
	public static void main (String[] args)
	{
		System.out.println(multiply());
	}
}

		