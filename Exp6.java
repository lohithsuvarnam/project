import java.util.*;
class CJP6
{
	static Scanner sc =new Scanner(System.in);
	static CJP3 obj =new CJP3();
	static int m1(int a)
	{
		System.out.println(a);
		return sc.nextInt();
	}
	static void m2(Boolean b)
	{
		System.out.print(b);
		if(b==false)
		{
			m2(sc.nextBoolean());
		}
		else
		{
			int c =m1(sc.nextInt());
			System.out.println(c);
			if(c>3)
			{
				class Local
				{
					void m3()
					{
						System.out.println("endhuku bhayya ivanni manaki");
					}
				}
				new Local().m3();
			}
			else
			{
				class Local
				{
					void m4()
					{
						m2(sc.nextBoolean());
					}
				}
				new Local().m4();
			}
		}
	}
	public static void main(String[]args)
	{
		m2(sc.nextBoolean());
	}
}