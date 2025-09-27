import java.util.*;
class Cab
{
	static Scanner sc=new Scanner(System.in);
	static String def = "\u001B[0m";
    	static String blink = "\u001B[5m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
    	static String purple = "\u001B[35m";
    	static String skblue = "\u001B[36m";	
	
	static double price;
	static float distance;
	void request_Ride()
	{
		pickup_Location();
		
	}

	void pickup_Location()
	{
		System.out.println();
		System.out.println(blink+green+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(green+"\t\t\t\t\t\t\t\t| Select your pickup location  |"+def);
		System.out.println(blink+green+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(red+"\t\t\t\t\t\t\t\t   <<<<<< TO HYDERABAD >>>>>>"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 1: Visakhapatnam to Hyderabad|"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 2: Rajahmundry to Hyderabad  |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 3: Vijayawada to Hyderabad   |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 4: Nellore to Hyderabad      |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 5: Tirupati to Hyderabad     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 6: Ongole to Hyderabad       |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 7: Warangal to Hyderabad     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 8: Karimnagar to Hyderabad   |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t| 9: Nizamabad to Hyderabad    |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(red+"\t\t\t\t\t\t\t\t  <<<<<< FROM HYDERABAD >>>>>>"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|10: Hyderabad to Visakhapatnam|"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|11: Hyderabad to Rajahmundry  |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|12: Hyderabad to Vijayawada   |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|13: Hyderabad to Nellore      |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|14: Hyderabad to Tirupati     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|15: Hyderabad to Ongole       |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|16: Hyderabad to Warangal     |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|17: Hyderabad to Karimnagar   |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println(yellow+"\t\t\t\t\t\t\t\t|18: Hyderabad to Nizamabad    |"+def);
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t--------------------------------"+def);
		System.out.println();
		while(true)
		{
		int n=sc.nextInt();
		if(n==1)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=619;
			vehicle();
			break;
		}
		else if(n==2)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=433;
			vehicle();
			break;
		}
		else if(n==3)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=277;
			vehicle();
			break;
		}
		else if(n==4)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=458;
			vehicle();
			break;
		}
		else if(n==5)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=561;
			vehicle();		
			break;
		}
		else if(n==6)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=327;
			vehicle();
			break;
		}
		else if(n==7)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=149;
			vehicle();
			break;
		}
		else if(n==8)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=160;
			vehicle();
			break;
		}
		else if(n==9)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=172;
			vehicle();
			break;
		}
		else if(n==10)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=619;
			vehicle();
			break;
		}
		else if(n==11)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=433;
			vehicle();
			break;
		}
		else if(n==12)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=277;
			vehicle();
			break;
		}
		else if(n==13)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=458;
			vehicle();
			break;
		}
		else if(n==14)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=561;
			vehicle();
			break;
		}
		else if(n==15)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=327;
			vehicle();
			break;
		}
		else if(n==16)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=149;
			vehicle();
			break;
		}
		else if(n==17)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=160;
			vehicle();
			break;
		}
		else if(n==18)
		{
			System.out.println(purple+"\t\t\t\t\t\t\t\tYour pickup location is confirmed!"+def);
			distance=172;
			vehicle();
			break;
		}

		else
		{
			System.out.println("Invalid Input");
			System.out.println("Please enter valid input");
		}
	
		}
	}
	void vehicle()
	{
		System.out.println();
		System.out.println("Press \n1 for Hatchback\n2 for Sedan\n3 for SUV");
		while(true)
		{
			int n=sc.nextInt();
			if(n==1)
			{
				System.out.println(green+"You selected Hatchback for your ride");
				System.out.println(yellow+"capacity : "+def+"4 persons");
				hatchback();
				break;
			}
			if(n==2)
			{
				System.out.println(green+"You selected Sedan for your ride");
				System.out.println(yellow+"capacity : "+def+"4 persons");
				sedan();
				break;
			}
			if(n==3)
			{
				System.out.println(green+"You selected SUV for your ride");
				System.out.println(yellow+"capacity : "+def+"6 persons");
				suv();
				break;
			}
			else
			{
				System.out.println("Invalid Input");	
			}
		}
	}
	void hatchback()
	{
		int price_Per_Km=9;
		float k=this.distance;
		int Base_fare=350;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(yellow+"Charge   : "+def);
		System.out.printf("%.2f",price);
		System.out.println(yellow+" /-"+def);
		System.out.println();
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			int h=sc.nextInt();
			if(h==1)
			{
				confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				cancel_Ride();
				break;
			}
			else
			{
				System.out.println(red+"Invalid Option");
				System.out.println(green+"Please enter valid option"+def);
			}
		}

	}
	void sedan()
	{
		int price_Per_Km=25;
		float k=this.distance;
		int Base_fare=800;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(yellow+"Charge   : "+def);
		System.out.printf("%.2f",price);
		System.out.println(yellow+" /-"+def);
		System.out.println();
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			int h=sc.nextInt();
			if(h==1)
			{
				confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				cancel_Ride();
				break;
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
			}
		}
	}
	void suv()
	{
		int price_Per_Km=20;
		float k=this.distance;
		int Base_fare=650;
		price=Base_fare+(k*price_Per_Km);
		System.out.print(yellow+"Charge   : "+def);
		System.out.printf("%.2f",price);
		System.out.println(yellow+" /-"+def);
		
		System.out.println(skblue+"\t\t\t\t1: Confirm Ride"+'\n'+"\t\t\t\t2: Want to Change Vehicle"+'\n'+"\t\t\t\t3: Cancel ride"+def);
		while(true)
		{
			int h=sc.nextInt();
			if(h==1)
			{
				confirm_Ride();
				break;
			}
			else if(h==2)
			{
				vehicle();
				break;
			}
			else if(h==3)
			{
				cancel_Ride();
				break;
			}
			else
			{
				System.out.println(red+"Invalid Option"+def);
				System.out.println(green+"Please enter valid option"+def);
			}
		}
		
	}
	void confirm_Ride()
	{
		driver obj=new driver();
		obj.driver();
	}
	void cancel_Ride()
	{
		System.out.println(yellow+"Your ride has been Cancelled"+def);
	}
}

class driver extends Cab
{
	static Scanner sc=new Scanner(System.in);
	static String def = "\u001B[0m";
    	static String blink = "\u001B[5m";
    	static String red = "\u001B[31m";
    	static String green = "\u001B[32m";
    	static String yellow = "\u001B[33m";
    	static String blue = "\u001B[34m";
    	static String purple = "\u001B[35m";
    	static String skblue = "\u001B[36m";	


	private String Driver_name = "Rahul";
	private String Vechile_num = "AP05BF0369";
	driver()
	{
		this.Driver_name = Driver_name;
		this.Vechile_num = Vechile_num;
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
			while(true)
			{
				int l=sc.nextInt();
				if(l==1)
				{
					
					otp();
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
	void driver()
	{
		System.out.println(blink+yellow+"\t\t\t\t\t\t\t\t...Searching for a driver..."+def);
		try 
		{
            		Thread.sleep(8000);
        	} 
		catch (InterruptedException e) 
		{
            		e.printStackTrace();
        	}
		System.out.println();
		System.out.println(green+"\t\t\t\t\t\t\tYour Ride has been accepted by driver agent "+this.Driver_name+def);
		System.out.println();
		System.out.println(skblue+"\t\t\t\t\t\t\tYour Driver! is on the way....he will be Arrive soon...."+def);
		System.out.println();
			
		try 
		{
           	 	Thread.sleep(8000);
        	} 
		catch (InterruptedException e) 
		{
            		e.printStackTrace();
        	}
		System.out.println(yellow+"\t\t\t\t\t\t\tYour driver "+this.Driver_name+" with "+this.Vechile_num+" Arrived! to your pickup location"+def);
		System.out.println();
		System.out.println(blink+purple+"\t\t\t\t\t\t\tShare OTP with your driver and Start your Ride..."+def);
		System.out.println();	 
		
		otp();
		System.out.println(yellow+"\t\t\t\t\t\t\t\t...Ride Started! Enjoy Your Ride..."+def);
			try 
			{
				Thread.sleep(10000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			System.out.println();
		System.out.println(blink+green+"\t\t\t\t\t\t\t\t***Your destination arrived***"+def);
	}
}

class USER extends driver
{
	public static void main(String[]args)	
	{

	  String def = "\u001B[0m";
    	  String blink = "\u001B[5m";
    	  String red = "\u001B[31m";
    	  String green = "\u001B[32m";
    	  String yellow = "\u001B[33m";
    	  String blue = "\u001B[34m";
    	  String purple = "\u001B[35m";
    	  String skblue = "\u001B[36m";	
	

	  System.out.println();


          System.out.println(blink+red+"\t\t\t\t                          :*+---======+++=====--:.  ");                                                                            
          System.out.println(blink+red+"\t\t\t\t                   .:-+*#*+==--:::....=%%::::-==+*++-.   ");                                  
          System.out.println(blink+red+"\t\t\t\t               :=+#%#=:               .%%+         .-+#+:  ");                                
          System.out.println(blink+red+"\t\t\t\t         ..-+*%%%%%%+                  *%%:            :+#*=.  ");                            
          System.out.println(blink+red+"\t\t\t\t .***##%%%%%%%%%%%%%%+:....            =%%#             *%%%%#+:.......     ");               
          System.out.println(blink+red+"\t\t\t\t :%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%####%%%##############%%%%%%%%%%%%%%%%##**+=--:.");        
          System.out.println(blink+red+"\t\t\t\t =%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#*+-.");  
          System.out.println(blink+red+"\t\t\t\t-#%%%%%%%%%%%%%%%##***#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#***#%%%%%%%%%%+"); 
          System.out.println(blink+red+"\t\t\t\t*%%%%%%%%%%%%%#***#%%#***#%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%#**#%%%#***#%%%%%%#"); 
          System.out.println(blink+red+"\t\t\t\t*%%%%%%%%%%%%**#+-+ .+-+%**%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*##+=+ .=-*%**%%%%%#"); 
          System.out.println(blink+red+"\t\t\t\t-#%%%%%%%%%%*##:= :..:.=:%#*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%+##:= -..:.=-%**%%%%+"); 
          System.out.println(blink+red+"\t\t\t\t  =**#%%%%%%+%+.:: -:..: *%+%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%+%+.:..-:.:: #%+%%%%+"); 
          System.out.println(blink+red+"\t\t\t\t         ....##:*:... :*:##=#########################################=%*:*:... -*:##-++=- "); 
          System.out.println(blink+red+"\t\t\t\t             :##-.+ .+.-##:                                           -#*-:* :=.-##.      "); 
          System.out.println(blink+red+"\t\t\t\t               =*##**##*-                                               =*#***##+-        "+def); 
     
     


		USER x=new USER();
		x.request_Ride();
	}
}			
			
			















		