import java.util.*;
class Ex14
{
	static Scanner sc=new Scanner(System.in);
	static int m1(String a)	
	{
		System.out.print(a);
		return sc.nextInt();
	}
	boolean m2(int b)
	{
		System.out.print(b);
		return sc.nextBoolean();
	}
	public static void main(String[] args)
	{
		System.out.print(m1(sc.next()));
		System.out.print(new Ex14().m2(sc.nextInt()));
	}
}