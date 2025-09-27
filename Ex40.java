import java.util.*;
class Restaurent
{
	static Scanner sc=new Scanner(System.in);
	double chicken_biriyani(int quantity)
	{
		return quantity*250;
	}
	double mutton_biriyani(int quantity)
	{
		return quantity*500;
	}
	double veg_biriyani(int quantity)
	{
		return quantity*200;
	}
}
class Swiggy extends Restaurent
{
	double bill=0;
	void menu()
	{
		while(true)
		{
			System.out.println("1-chicken biriyani-250rs");
			System.out.println("2-mutton biriyani-500rs");
			System.out.println("3-veg Biriyani-200rs");
			System.out.println("Select your item");
			int n=sc.nextInt();
	
			if(n==1)
			{
				System.out.println("Enter quantity :");
				bill=bill+chicken_biriyani(sc.nextInt());
				break;
			}
			else if(n==2)
			{
				System.out.println("Enter quantity :");
				bill=bill+mutton_biriyani(sc.nextInt());
				break;
			}
			else if(n==3)
			{
				System.out.println("Enter quantity :");
				bill=bill+veg_biriyani(sc.nextInt());
				break;
			}
			else
			{
				System.out.println("Invalid Input please select valid item");
			}
		}
		System.out.println("press 1 for order food or 2 for billing or any key to exit");
		char ch=sc.next().charAt(0);
		if(ch=='1')
		{
			menu();
		}
		else if(ch=='2')
		{
			billing(bill);
		}
		else
		{
			System.out.println("have a nice day");
		}
	}
	void billing(double bill)
	{
			System.out.println("your item bill="+bill);
			double tax=bill*0.05;
			System.out.println("Tax on your order="+tax);
			double discount=0.09;
			if(bill>1000)
			{
				System.out.println("Discount on your order="+bill*0.09);
			}
			double delivery=50;
			System.out.println("delivery charge="+delivery);
			System.out.println("Total bill amount="+(bill+tax-discount+delivery));
	}
}
class Zomato extends Restaurent
{
	double bill=0;
	void menu()
	{
		while(true)
		{
			System.out.println("1-chicken biriyani-250rs");
			System.out.println("2-mutton biriyani-500rs");
			System.out.println("3-veg Biriyani-200rs");
			System.out.println("Select your item");
			int n=sc.nextInt();
	
			if(n==1)
			{
				System.out.println("Enter quantity :");
				bill=bill+chicken_biriyani(sc.nextInt());
				break;
			}
			else if(n==2)
			{
				System.out.println("Enter quantity :");
				bill=bill+mutton_biriyani(sc.nextInt());
				break;
			}
			else if(n==3)
			{
				System.out.println("Enter quantity :");
				bill=bill+veg_biriyani(sc.nextInt());
				break;
			}
			else
			{
				System.out.println("Invalid Input please select valid item");
			}
		}
		System.out.println("press 1 for order food or 2 for billing or any key to exit");
		char ch=sc.next().charAt(0);
		if(ch=='1')
		{
			menu();
		}
		else if(ch=='2')
		{
			billing(bill);
		}
		else
		{
			System.out.println("have a nice day");
		}
	}
	void billing(double bill)
	{
			System.out.println("your item bill="+bill);
			double tax=bill*0.05;
			System.out.println("Tax on your order="+tax);
			double discount=0.09;
			if(bill>1000)
			{
				System.out.println("Discount on your order="+bill*0.09);
			}
			double delivery=50;
			System.out.println("delivery charge="+delivery);
			System.out.println("Total bill amount="+(bill+tax-discount+delivery));
	}
}
class User 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1-swiggy\n2-zomato\nany key to exit");
		char a=sc.next().charAt(0);
		if(a=='1')
		{
			new Swiggy().menu();
		}
		else if(a=='2')
		{
			new Zomato().menu();
		}
		else
		{
			System.out.println("Invalid app\nplease choose valid option");
			main(args);
		}
	}
}
		
		
		
		
			
	
	
	
	
	