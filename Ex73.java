import java.util.*;
interface I
{
	float m1(String a);
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		I x=(a)->
		{
			System.out.println(a);
			return sc.nextFloat();
		};
		System.out.println(x.m1(sc.next()));
	}
}