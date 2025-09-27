import java.util.*;
interface Prime
{
	Scanner sc=new Scanner(System.in);
	boolean isprime(int a);
}
interface Palindrome
{
	Scanner sc=Prime.sc;
	boolean ispalindrome(int a);
}

class A
{
	public static void main(String[] args)
	{
		Scanner sc=Prime.sc;
		Prime x=(a)->
		{
			System.out.println(a);
			return sc.nextBoolean();
		};
		System.out.println(x.isprime(sc.nextInt()));
		Palindrome y=(a)->
		{
			System.out.println(a);
			return sc.nextBoolean();
		};
		System.out.println(y.ispalindrome(sc.nextInt()));
	}
}  