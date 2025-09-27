import java.util.*;
class Main
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2; ;i++)
		{
			int fc=0;
			for(int j=2;j<=(int)Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					fc=fc+1;
				}
			}
			if(fc==0)
			{
				System.out.println(i);
				c=c+1;
				if(c==n)
				{
					break;
				}
			}
		}
	}
}