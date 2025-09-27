.
import java.util.Scanner;

abstract class A
{
	
	abstract int M1 (String a);
	abstract float M2 (boolean a);
	public static void main (String[]args)
	{
		Scanner sc = new Scanner (System.in);
		A x = new A()
		{
			int M1 (String a)
			{
				System.out.println(a);
				return sc.nextInt();
			}
			float M2 (boolean a)
			{
				System.out.println(a);
				return sc.nextFloat();
			}
		};
		System.out.println(x.M1(sc.next()));
		System.out.println(x.M2(sc.nextBoolean()));
		System.out.println(x.getClass());
	}
}