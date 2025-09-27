import java.util.*;
class Airtel
{
	static Scanner sc=new Scanner(System.in);
	double recharge(int plan)
	{
		if(plan==1)
		{
			return 299;
		}
		if(plan==2)
		{
			return 699;
		}
		return 899;
	}
}
class Cellshop extends Airtel
{
	double bill=0;
	void plans()
	{
		System.out.println("1-unlimited calls 28 days-299rs");
		System.out.println("2-unlimited calls 56 days-699rs");
		System.out.println("3-unlimited calls 90 days-899rs");
	}
	void selection() 
	{
		plans();
		System.out.println("Select a plan");
		int plan=sc.nextInt();
		if(plan>=1 && plan<=3)
		{
			bill=bill+recharge(plan);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		System.out.println("press 1 for another recharge or 2 for billing or 3 for exit");
		char ch=sc.next().charAt(0);
		if(ch=='1')
		{
			selection();
		}
		else if(ch=='2')
		{
			if(bill>0)
			{
				billing(bill);
			}
			else
			{
				System.out.println("No plan Purchased");
			}
		}
		else
		{
			System.out.println("Thankyou Visit again");
		}
	}
	void billing(double bill)
	{
		System.out.println("recharge amount ="+bill);
		double tax=bill*0.10;
		System.out.println("Tax on recharge ="+tax);
		System.out.println("Total bill amount ="+(bill+tax));
	}
}
class User extends Cellshop
{
	public static void main(String[] args)
	{
		User x=new User();
		x.selection();
	}
}

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     