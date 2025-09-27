import java.util.*;
class A //A$B
{
		static Scanner sc=new Scanner(System.in);
		private double a=sc.nextDouble();
		float m1(String a)
		{
			System.out.println(a);
			return sc.nextFloat();
		}
		static class B
		{
			int m2(long b)
			{
				System.out.println(b);
				System.out.println(new A().a);
				return sc.nextInt();
			}
			static float m3(short a)
			{
				System.out.println(a);
				return sc.nextFloat();
			}
			public static void main(String[] args)
			{
				A x=new A();
				System.out.println(x.m1(sc.next()));
				B y=new B();
				System.out.println(y.m2(sc.nextLong()));
				System.out.println(A.B.m3(sc.nextShort()));
			}

		}
}
