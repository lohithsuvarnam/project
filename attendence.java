import java.util.*;
class Students
{
	static Scanner sc = new Scanner(System.in);
	float attendance;
	String corejava(float attendance)
	{
		System.out.println("Enter programming attendance");
		float b = programming(sc.nextFloat());
		this.attendance = (attendance+b)/2;
		if(attendance>this.attendance && attendance>b)
		{
			return "Good keep it up";
		}
		if(attendance==b)
		{
			return "ok ok";
		}
		return "tata bye bye";
	}
	float programming(float attendance)
	{ 	
		return attendance;
		
	}
	public static void main(String[]args)
	{
		Students s = new Students();
		System.out.println("Enter core java attendance");
		System.out.println(s.corejava(sc.nextFloat()));
	}
}