import java.util.*;
class Bank
{
	double balance=10000;
	double deposit(double amount)
	{
		balance=balance+amount;
		System.out.println("Successfully deposited amount inr "+amount);
		return balance;
	}
	double withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance=balance-amount;
			System.out.println("Transaction successful ");
		}
		else
			System.out.println("Insufficient funds");
		
		return balance;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Bank x=new Bank();
	while(true){
			System.out.println("1 - deposit\n2 - withdraw");
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.print("enter your amount to be deposited : ");
				System.out.println("Avalable balance : "+x.deposit(sc.nextDouble()));
			}
			else if(n==2)
			{
				System.out.print("Enter withdrawl amount : ");
				System.out.println("Available balance : "+x.withdraw(sc.nextDouble()));
			}
			else
			{
				System.out.println("Invalid operation");
			}
			System.out.print("press 1 to perform another operation or any key to exit : ");
			char ch=sc.next().charAt(0);
			if(ch!='1')
			{
				System.out.println("Thank you visit again :)");
				break;
			}
		}
	}
}