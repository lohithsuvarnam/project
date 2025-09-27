import java.util.*;
class Bank
{
	double balance=1000;
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
		{
			System.out.println("Insufficient funds");
		}
		return balance;
	}
	void balanceenquiry()
	{
		System.out.println("available balance = "+balance);
	}
}
class User extends Bank
{
	static Scanner sc=new Scanner(System.in);
	void transaction()
	{
		System.out.println("1-deposit\n2-withdraw\n3-balanceenquiry");
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println("enter deposit amount");
			System.out.println(deposit(sc.nextDouble()));
		}
		else if(n==2)
		{
			System.out.println("enter withdraw amount");
			System.out.println(withdraw(sc.nextDouble()));
		}
		else if(n==3)
		{
			balanceenquiry();
		}
		else
		{
			System.out.println("Invalid Input");
		}
		System.out.println("enter 1 to do another transaction");
		char ch=sc.next().charAt(0);
		if(ch=='1')
		{
			transaction();
		}
		else
		{
			System.out.print("Thank you:\n");
		}
	}
	public static void main(String[] args)
	{
		User x=new User();
		x.transaction();
		main(args);
	}
}
	
