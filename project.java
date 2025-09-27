import java.util.*;
import java.io.Console;
class Registration
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";a
    static String skblue = "\u001B[36m";
	static Payments obj=new Payments();
	static Scanner sc=new Scanner(System.in);
	
	private String  userName="buntykonda";

	private String password="bunty***";
	
	private String mob="9701584711";
	
	void setUserName(String userName)
	{
		this.userName=userName;
	}
	void setPassword(String password)
	{
		if(password.length()>=8)
		{	
			this.password=password;
		}
		else 
		{
			System.out.println(red+"Invalid password"+def);
			System.out.println(yellow+"Please enter valid password!"+def);
			System.out.println(green+"Enter your password: "+def);
			obj.setPassword(sc.next());
		}
	}
	void setMob(String mob)
	{
		if(mob.length()==10)
		{
			this.mob=mob;
			System.out.println(skblue+"OTP sent to your registered mobile number"+def);
			
			obj.otp();
			System.out.println(blink+green+"--------------------------------SIGN UP Successfull--------------------------------"+def);
			System.out.println(yellow+"\t\t\t\tProceed to login..."+def);
			obj.login();
		}
		else 
		{
			System.out.println(green+"Enter your mobile number: "+def);
			System.out.println(red+"Invalid Mobile number"+def);
			System.out.println(yellow+"Please enter valid Mobile number!"+def);
			obj.setMob(sc.next());
		}
	}
	void login() 
	{
		System.out.println(green+"Enter UserName: "+def);
		String userName=sc.next();

		System.out.println(green+"Enter Password: "+def);
		String password=sc.next();

		System.out.println(green+"Enter mob: "+def);
		System.out.print(green+"+91 "+def);
		String mob=sc.next();

		if(userName.equals(this.userName) && password.equals(this.password) && mob.equals(this.mob))
		{

			obj.otp();
            		System.out.println(blink+green+"--------------------------------Login Successful--------------------------------"+def);
		}
	    else     
		{	
			System.out.println(blink+red+"Details Mismatched"+def);
			System.out.println(green+"pls enter valid details"+def);
			System.out.println(blue+"1: Create new Account"+'\n'+"2: Forget details"+def);
			
			while(true)
			{
				int n=sc.nextInt();
				if(n==1)
				{
					obj.signup();
					break;
				}
				else if(n==2)
				{
					obj.forgot();
					break;
				}
				else
				{
					System.out.println("Invalid Option");
					System.out.println("Please enter valid option");
				}
			}
		}
	}
	void otp()
	{
		int a=(int)(Math.random()*(9999-1001+1)+1001);

		System.out.println(skblue+"OTP sent to your registered mobile number"+def);
		System.out.println(red+"your OTP: "+a+def);
		System.out.println(green+"Enter your OTP: "+def);
		int b=sc.nextInt();

		if(b==a)
		{
			System.out.println(yellow+"OTP is correct"+def);
		}
		else
		{
			System.out.println(yellow+"OTP is Incorrect"+def);
			System.out.println(red+"Press 1 to Resend OTP"+def);
			//timer
			while(true)
			{
				int l=sc.nextInt();
				if(l==1)
				{
					
					obj.otp();
					break;
				}
				else
				{
					System.out.println(blue+"Invalid Option"+def);
					System.out.println(yellow+"Please enter valid option"+def);
				}
			}
		}
	}
	void forgot()
	{
		System.out.println(green+"Enter your registered mobile number: "+def);
		System.out.print(green+"+91 "+def);
		String mob=sc.next();
		
		if(mob.equals(this.mob))
		{
			System.out.println(skblue+"OTP sent to your registered mobile number"+def);
			
			obj.otp();
			System.out.println(blue+"1: Reset password" + '\n' + "2: Recovery"+def);
			
			while(true)
			{
				int m=sc.nextInt();
				if(m==1)
				{
					System.out.println(blink+yellow+"Password must contain atleast 8 characters"+def);
					System.out.println(green+"Enter your new password: "+def);
					obj.setPassword(sc.next());
					this.password=password;
					System.out.println(yellow+"Your password changed Succesfully!"+def);
					obj.login(); 
					break;
				}
				else if(m==2)
				{
					System.out.println(green+"Your account details are: "+def);
					System.out.println(yellow+"userName: "+ this.userName + '\n' +"password: "+ this.password+def);
					obj.login();
					break;
				}
				else
				{
					System.out.println("Invalid Option");
					System.out.println("Please enter valid option");
				}
			}		
		}
		else
		{
			System.out.println(red+"Registered mobile number mismatched"+def);
			System.out.print(green+"Re-"+def);
			obj.forgot();
		}
			
	}
	void signup()
	{
		System.out.println(green+"Enter UserName: "+def);
 		String userName=sc.next();
		this.userName=userName;

		System.out.println(blink+yellow+"Password must contain atleast 8 characters"+def);
		//System.out.println(blink+yellow+"Password must contain a special character");
		System.out.println(green+"Enter your password: "+def);
		obj.setPassword(sc.next());

		System.out.println(blink+yellow+"Mobile number must contain 10 digits"+def);
		System.out.println(green+"Enter your mobile number: "+def);
		System.out.print(green+"+91 "+def);
		obj.setMob(sc.next());
	}
}
/*
*************************************************************************************************************************
*/

class User extends Registration
{
	static int n1;
	static int n2;
	void request_Ride()
	{
		pickup_Location();
		
	}
	void pickup_Location()
	{
		System.out.println();
		System.out.println(blink+red+"\t\t\t\t-------------------------------"+def);
		System.out.println(red+"\t\t\t\t| Select your pickup location |"+def);
		System.out.println(blink+red+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 1: Kphb                     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 2: Kukatpally               |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 3: Miyapur                  |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 4: Moosapet                 |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 5: Ameerpet                 |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 6: Jubilee hills            |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		while(true)
		{
			if(sc.hasNextInt())
			{
			n1=sc.nextInt();
			if(n1==1)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			else if(n1==2)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			else if(n1==3)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			else if(n1==4)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			else if(n1==5)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			else if(n1==6)
			{
				System.out.println(green+"\t\t\t\tYour pickup location is confirmed!"+def);
				obj.drop();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}	
	}
	void drop()
	{
		System.out.println();
		System.out.println(blink+red+"\t\t\t\t-------------------------------"+def);
		System.out.println(red+"\t\t\t\t| Select your drop location   |"+def);
		System.out.println(blink+red+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 1: Bharat Nagar             |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 2: Borabanda                |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 3: Pragathi Nagar           |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 4: Madhapur                 |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 5: Hi-tech city             |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 6: Golconda                 |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);

		while(true)
		{
		if(sc.hasNextInt())
		{
				n2=sc.nextInt();
				if(n2==1)
				{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
				else if(n2==2)
				{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
			else if(n2==3)
			{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
			else if(n2==4)
			{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
			else if(n2==5)
			{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
			else if(n2==6)
			{
					System.out.println(green+"\t\t\t\tYour drop location is confirmed!"+def);
					System.out.println();
					System.out.println(blue+"\t\t\t\t1: Confirm to Proceed"+'\n'+"\t\t\t\t2: Change Locations"+def);
					while(true)
					{
						if(sc.hasNextInt())
						{
							int n3=sc.nextInt();
							if(n3==1)
							{
								obj.vehicle();
		    						break;
							}
							else if(n3==2)
							{
									pickup_Location();
									break;
							}
						}
						else
						{
			    					System.out.println(red+"Invalid Option"+def);
			    					System.out.println(green+"Please enter valid option"+def);
								sc.next();
						}
					}
				}
		}
		else
		{
			System.out.println(red+"Invalid Option"+def);
			System.out.println(green+"Please enter valid option"+def);
			sc.next();
		}
		}
	}
	void vehicle()
	{
		System.out.println(blink+red+"\t\t\t\t-------------------------------"+def);
		System.out.println(red+"\t\t\t\t| Select your vehicle         |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 1: Bike                     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 2: Auto                     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t| 3: Car                      |"+def);
		System.out.println(blink+yellow+"\t\t\t\t-------------------------------"+def);

		while(true)
		{
			if(sc.hasNextInt())
			{
			int n3=sc.nextInt();
			if(n3==1)
			{
				obj.bike();
				break;
			}
			else if(n3==2)
			{
				obj.auto();
				break;
			}
			else if(n3==3)
			{
				obj.car();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}
	}
	float distance()
	{
		for(int i=n1;i<=6;i++)
		{
			for(int j=n2;j<=6;j++)
			{
				if(i==1 && j==1)
				{
					System.out.println(green+"Ride distance is 4.9km"+def);
					return 4.9f;
					
				}
				else if(i==1 && j==2)
				{
					System.out.println(green+"Ride distance is 6.6km"+def);
					return 6.6f;
				}
				else if(i==1 && j==3)
				{
					System.out.println(green+"Ride distance is 5.6km"+def);
					return 5.6f;
				}
				else if(i==1 && j==4)
				{
					System.out.println(green+"Ride distance is 9.4km"+def);
					return 9.4f;
				}
				else if(i==1 && j==5)
				{
					System.out.println(green+"Ride distance is 7.2km"+def);
					return 7.2f;
				}
				else if(i==1 && j==6)
				{
					System.out.println(green+"Ride distance is 15km"+def);
					return 15f;
				}
				else if(i==2 && j==1)
				{
					System.out.println(green+"Ride distance is 6.8km"+def);
					return 6.8f;
				}
				else if(i==2 && j==2)
				{
					System.out.println(green+"Ride distance is 6.8km"+def);
					return 6.8f;
				}
				else if(i==2 && j==3)
				{
					System.out.println(green+"Ride distance is 4.7km"+def);
					return 4.7f;
				}
				else if(i==2 && j==4)
				{
					System.out.println(green+"Ride distance is 5.9km"+def);
					return 5.9f;
				}
				else if(i==2 && j==5)
				{
					System.out.println(green+"Ride distance is 5.8km"+def);
					return 5.8f;
				}
				else if(i==2 && j==6)
				{
					System.out.println(green+"Ride distance is 15km"+def);
					return 15f;
				}
				else if(i==3 && j==1)
				{
					System.out.println(green+"Ride distance is 13km"+def);
					return 13f;
				}
				else if(i==3 && j==2)
				{
					System.out.println(green+"Ride distance is 14km"+def);
					return 14f;
				}
				else if(i==3 && j==3)
				{
					System.out.println(green+"Ride distance is 8.6km"+def);
					return 8.6f;
				}
				else if(i==3 && j==4)
				{
					System.out.println(green+"Ride distance is 12km"+def);
					return 12f;
				}
				else if(i==3 && j==5)
				{
					System.out.println(green+"Ride distance is 11km"+def);
					return 11f;
				}
				else if(i==3 && j==6)
				{
					System.out.println(green+"Ride distance is 23km"+def);
					return 23f;
				}
				else if(i==4 && j==1)
				{
					System.out.println(green+"Ride distance is 1.3km"+def);
					return 1.3f;
				}
				else if(i==4 && j==2)
				{
					System.out.println(green+"Ride distance is 4.3km"+def);
					return 4.3f;
				}
				else if(i==4 && j==3)
				{
					System.out.println(green+"Ride distance is 8.4km"+def);
					return 8.4f;
				}
				else if(i==4 && j==4)
				{
					System.out.println(green+"Ride distance is 6.4km"+def);
					return 6.4f;
				}
				else if(i==4 && j==5)
				{
					System.out.println(green+"Ride distance is 8.0km"+def);
					return 8.0f;
				}
				else if(i==4 && j==6)
				{
					System.out.println(green+"Ride distance is 17km"+def);
					return 17f;
				}
				else if(i==5 && j==1)
				{
					System.out.println(green+"Ride distance is 11km"+def);
					return 11f;
				}
				else if(i==5 && j==2)
				{
					System.out.println(green+"Ride distance is 5.7km"+def);
					return 5.7f;
				}
				else if(i==5 && j==3)
				{
					System.out.println(green+"Ride distance is 13km"+def);
					return 13f;
				}
				else if(i==5 && j==4)
				{
					System.out.println(green+"Ride distance is 8.9km"+def);
					return 8.9f;
				}
				else if(i==5 && j==5)
				{
					System.out.println(green+"Ride distance is 13km"+def);
					return 13f;
				}
				else if(i==5 && j==6)
				{
					System.out.println(green+"Ride distance is 11km"+def);
					return 11f;
				}
				else if(i==6 && j==1)
				{
					System.out.println(green+"Ride distance is 15km"+def);
					return 15f;
				}
				else if(i==6 && j==2)
				{
					System.out.println(green+"Ride distance is 4km"+def);
					return 4f;
				}
				else if(i==6 && j==3)
				{
					System.out.println(green+"Ride distance is 14km"+def);
					return 14f;
				}
				else if(i==6 && j==4)
				{
					System.out.println(green+"Ride distance is 3.8km"+def);
					return 3.8f;
				}
				else if(i==6 && j==5)
				{
					System.out.println(green+"Ride distance is 5.7km"+def);
					return 5.7f;
				}
				else if(i==6 && j==6)
				{
					System.out.println(green+"Ride distance is 7.8km"+def);
					return 7.8f;
				}
			}
		}
		return 0.0f;
	}
}
class Vehicle extends User
{
	static int price_Per_Km=5;
	static double price;

	void bike()
	{
		float k=obj.distance();
		int Base_fare=10;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(blink+yellow+"Charge: "+def);
		System.out.format("%.2f",price);
		System.out.println(yellow+" /-"+def);
		System.out.println();
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			if(sc.hasNextInt())
			{
			int h=sc.nextInt();
			if(h==1)
			{
				obj.confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				obj.cancel_Ride();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid Option");
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}

	}
	void auto()
	{
		float k=obj.distance();
		int Base_fare=30;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(blink+yellow+"Charge: "+def);
		System.out.format("%.2f",price);
		System.out.println(yellow+" /-"+def);
		System.out.println();
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			if(sc.hasNextInt())
			{
			int h=sc.nextInt();
			if(h==1)
			{
				obj.confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				obj.cancel_Ride();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}
	}
	void car()
	{
		float k=obj.distance();
		int Base_fare=50;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(blink+yellow+"Charge: "+def);
		System.out.format("%.2f",price);
		System.out.println(yellow+" /-"+def);
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			if(sc.hasNextInt())
			{
			int h=sc.nextInt();
			if(h==1)
			{
				obj.confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				obj.cancel_Ride();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}
		
	}
	void confirm_Ride()
	{
		obj.driver();
	}
	void cancel_Ride()
	{
		System.out.println(yellow+"Your ride has been Cancelled"+def);
	}
}
class Driver extends Vehicle
{
	private String Driver_name = "Rahul";
	private String Vechile_num = "TS003202";
	Driver()
	{
		this.Driver_name = Driver_name;
		this.Vechile_num = Vechile_num;
	}
	void driver()
	{
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t...Searching for a driver..."+def);
		try 
		{
            // Sleep for 8 seconds (8000 milliseconds)
            		Thread.sleep(8000);
        	} 
		catch (InterruptedException e) 
		{
            		e.printStackTrace();
        	}
		System.out.println();
		System.out.println(green+"\t\t\t\t\t\t\t\tYour Ride has been accepted by driver agent "+this.Driver_name+def);
		System.out.println();
		System.out.println(skblue+"\t\t\t\t\t\t\t\tYour Driver! is on the way....he will be Arrive soon...."+def);
		System.out.println();
			
		//timer method
		try 
		{
            // Sleep for 8 seconds (8000 milliseconds)
           	 	Thread.sleep(8000);
        	} 
		catch (InterruptedException e) 
		{
            		e.printStackTrace();
        	}
		System.out.println(yellow+"\t\t\t\t\t\t\t\tYour driver "+this.Driver_name+" with "+this.Vechile_num+" Arrived! to your pickup location"+def);
		System.out.println();
		System.out.println(blink+purple+"\t\t\t\t\t\t\t\tShare OTP with your driver and Start your Ride..."+def);
		System.out.println();	 
		//timer method
		
		obj.otp();
		System.out.println(yellow+"\t\t\t\t\t\t\t\t...Ride Started! Enjoy Your Ride..."+def);
			try 
			{
				// Sleep for 10 seconds (10000 milliseconds)
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println();
		System.out.println(blink+green+"\t\t\t\t\t\t\t\t***Your destination arrived***"+def);
		System.out.println();
		
		System.out.println(blink+red+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		System.out.println(red+"\t\t\t\t\t\t\t\t| Choose payment option       |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 1: Paytm                    |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 2: Phonepay                 |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 3: Gpay                     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		while(true)
		{
			if(sc.hasNextInt())
			{
				int x=sc.nextInt();
				if(x==1)
				{
					obj.paytm(price);
					break;
				}
				else if(x==2)
				{
					obj.phonepay(price);
					break;
				}
				else if(x==3)
				{
					obj.gpay(price);
					break;
				}
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
				sc.next();
			}
		}
	}
}	
class Payments extends Driver
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";
	
	static Scanner sc=new Scanner(System.in);
	
	void paytm(double amount)
	{
        
        while (true) 
		{
			System.out.println(blink+red+"\t\t\t\t\t\t\t\t-------------------------------"+def);
			System.out.println(red+"\t\t\t\t\t\t\t\t| Select your Bank             |"+def);
			System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
			System.out.println(yellow+"\t\t\t\t\t\t\t\t| 1: SBI Bank                  |"+def);
			System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
			System.out.println(yellow+"\t\t\t\t\t\t\t\t| 2: Axis Bank                 |"+def);
			System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t-------------------------------"+def);
		
	    if(sc.hasNextInt())
	    {	
            int n =sc.nextInt();
            if (n==1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw(amount);
                break;
            } 
            else if (n==2) 
            {
                AxisBank obj = new AxisBank();
                obj.withdraw(amount);
                break;
            }
	    }
            else 
            {
                System.out.println(red+"\t\t\t\t\t\t\t\tInvalid Option"+def);
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
		sc.next();
            }
        }
	}
	void gpay(double amount)
	{
		while (true) 
		{
			System.out.println(red+"--------------------------------Select your Bank--------------------------------"+def);
			System.out.println(yellow+"\t\t\t\t1: SBI Bank"+'\n'+"\t\t\t\t2: Axis Bank"+def);

	    if(sc.hasNextInt())
	    {
            int n =sc.nextInt();
            if(n==1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw(amount);
                break;
            } 
            else if (n==2) 
            {
                AxisBank obj = new AxisBank();
                obj.withdraw(amount);
                break;
            } 
	}
            else 
            {
                System.out.println(red+"\t\t\t\t\t\t\t\tInvalid Option"+def);
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
		sc.next();
            }
        }
	}
	void phonepay(double amount)
	{
		while (true) 
		{
			if(sc.hasNextInt())
			{
			System.out.println(red+"\t\t........Select your Bank........"+def);
			System.out.println(yellow+"\t\t\t\t1: SBI Bank"+'\n'+"\t\t\t\t2: Axis Bank"+def);
            int n =sc.nextInt();
            if (n==1) 
            {
                SBIBank obj = new SBIBank();
                obj.withdraw(amount);
                break;
            } 
            else if (n==2) 
            {
                AxisBank obj = new AxisBank();
                obj.withdraw(amount);
                break;
            } 
	}
            else 
            {
		System.out.println(red+"\t\t\t\t\t\t\t\tInvalid Option"+def);
                System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter Valid Option : "+def);
		sc.next();
            }
        }
	}
}	
abstract class Bank 
{
    abstract void withdraw(double amount);
}
class SBIBank extends Bank 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
    double balance = 2000;
    private int pin = 1234;

    void setpin(int pin) 
    {
        this.pin = pin;
    }

    int getpin() 
    {
        return pin;
    }

    void withdraw(double amount) 
    {

        if (balance >= amount) 
	    {
            while (true) 
            {
		if(sc.hasNextInt())
		{
		System.out.println(yellow+"\t\t\t\t\t\t\t\tYour current balance is: "+def+blink+red+balance+def);
                System.out.print( green+"\t\t\t\t\t\t\t\tEnter your PIN: "+def );
                int n =sc.nextInt();
                if (n == pin)
		        {
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tPIN verified"+def);
                    balance = balance - amount;
                    System.out.println(blink+red+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
					try 
					{
						// Sleep for 3 seconds (3000 milliseconds)
						Thread.sleep(3000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					System.out.println(green+"\t\t\t\t\t\t\t\tRs."+amount+" deducted from your account!"+def);
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tRemaning Balance      :"+def+blink+red+balance+def);
                    break;
                } 
		        else if (n != pin) 
		        {
                    System.out.println(red+"\t\t\t\t\t\t\t\tInvalid PIN"+def);
					System.out.println(green+"\t\t\t\t\t\t\t\tPlease Enter correct PIN: "+def);
                }
		}
				else
				{
					System.out.println(red+"Invalid option"+def);
					System.out.println(yellow+"Please Enter valid option"+def);
					sc.next();
				}
            }
        }
	    else 
	    {
            	System.out.println(red+"\t\t\t\t\t\t\t\tInsufficent funds"+def);
            }
    }
}
class AxisBank extends Bank 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
    double balance = 2000;
    private int pin = 1234;

    void setpin(int pin) 
    {
        this.pin = pin;
    }

    int getpin() 
    {
        return pin;
    }

    void withdraw(double amount) 
    {
        if (balance >= amount) 
	    {
			System.out.println(yellow+"\t\t\t\t\t\t\t\tYour current balance is: "+def+blink+red+balance+def);
            System.out.print(green+"\t\t\t\t\t\t\t\tPlease Enter your PIN: "+def);
            while (true) 
            {
		if(sc.hasNextInt())
		{
                int n =sc.nextInt();
                if (n == pin) 
		        {
                    System.out.println(green+"\t\t\t\t\t\t\t\tPIN verified"+def);
                    balance = balance - amount;
                    System.out.println(red+"\t\t\t\t\t\t\t\tTransaction Successful"+def);
					try 
					{
						// Sleep for 3 seconds (3000 milliseconds)
						Thread.sleep(3000);
					} 
					catch (InterruptedException e) 
					{
						e.printStackTrace();
					}
					System.out.println(green+"\t\t\t\t\t\t\t\tRs."+amount+" deducted from your account!"+def);
                    System.out.println(yellow+"\t\t\t\t\t\t\t\tRemaning Balance      :"+red+balance);
                    break;
                }
		        else if (n != pin) 
		        {
                    System.out.println(red+"\t\t\t\t\t\t\t\tInvalid PIN ");
                    System.out.print(green+"\t\t\t\t\t\t\t\tPlease enter Correct PIN : "+def);
                }
		}
				else
				{
					System.out.println(red+"Invalid option"+def);
					System.out.println(green+"Please Enter valid option"+def);
					sc.next();
				}
            }
        } 
	else 
	{
            System.out.println(red+"\t\t\t\t\t\t\t\tInsufficent funds");
        }
        // return amount;
    }
}
class Main 
{
    static String def = "\u001B[0m";
    static String blink = "\u001B[5m";
    static String red = "\u001B[31m";
    static String green = "\u001B[32m";
    static String yellow = "\u001B[33m";
    static String blue = "\u001B[34m";
    static String purple = "\u001B[35m";
    static String skblue = "\u001B[36m";

    static Scanner sc=new Scanner(System.in);
	
	public static void main(String[]args)
	{
		System.out.println();
		System.out.println(blink+red+"  ______   __    __  ______   ______   __    __         ______   _______   ________  ________  _______  "+def);
        System.out.println(blink+red+" /      \\ |  \\  |  \\|      \\ /      \\ |  \\  /  \\       /      \\ |       \\ |        \\|        \\|       \\ "+def);
        System.out.println(blink+red+"|  $$$$$$\\| $$  | $$ \\$$$$$$|  $$$$$$\\| $$ /  $$      |  $$$$$$\\| $$$$$$$\\| $$$$$$$$| $$$$$$$$| $$$$$$$\\"+def);
	System.out.println(blink+red+"| $$  | $$| $$  | $$  | $$  | $$   \\$$| $$/  $$       | $$___\\$$| $$__/ $$| $$__    | $$__    | $$  | $$"+def);
        System.out.println(blink+red+"| $$  | $$| $$  | $$  | $$  | $$      | $$  $$         \\$$    \\ | $$    $$| $$  \\   | $$  \\   | $$  | $$"+def);
        System.out.println(blink+red+"| $$ _| $$| $$  | $$  | $$  | $$   __ | $$$$$\\         _\\$$$$$$\\| $$$$$$$ | $$$$$   | $$$$$   | $$  | $$"+def);
        System.out.println(blink+red+"| $$\\  \\$$| $$__/ $$ _| $$_ | $$__/  \\| $$ \\$$\\       |  \\__| $$| $$      | $$_____ | $$_____ | $$__/ $$"+def);
        System.out.println(blink+red+" \\$$ $$ $$| $$    $$|   $$ \\ \\$$    $$| $$  \\$$\\       \\$$    $$| $$      | $$     \\| $$     \\| $$    $$"+def);
        System.out.println(blink+red+"  \\$$$$$$  \\$$$$$$$  \\$$$$$$  \\$$$$$$  \\$$   \\$$        \\$$$$$$  \\$$       \\$$$$$$$$ \\$$$$$$$$ \\$$$$$$$ "+def);
        System.out.println(blink+red+"      \\$$$                                                                                              "+def);
        System.out.println(blink+red+"                                                                                                        "+def);
        System.out.println(blink+red+"                                                                                                        "+def);                                                             
    	
		System.out.println(blue+"\t\t\t\t1: Login"+'\n'+"\t\t\t\t2: Sign_Up"+def);
		
		while(true)
		{
			if(sc.hasNextInt())
			{
			int s=sc.nextInt();
			if(s==1)
			{
				Registration.obj.login();
				break;
			}
			else if(s==2)
			{
				Registration.obj.signup();
				break;
			}
			}
			else
			{
				System.out.println(red+"Invalid option"+def);
				System.out.println(green+"Please Enter valid option"+def);
				sc.next();
			}
		}
			System.out.println();
			System.out.println(blink+skblue+"\t\t\t\t***Book your Ride***"+def);
			Registration.obj.request_Ride();
	}
}

