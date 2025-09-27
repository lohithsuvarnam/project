import java.util.*;
class Student
{
	static Scanner sc=new Scanner(System.in);
	float attendence;
	float programming(float attendence)
	{
		return attendence;
	}
	String corejava(float attendance)
	{
		System.out.println("Enter programming attendance");
		float at=programming(sc.nextFloat());
		this.attendence=(attendance+at)/2;
		if(attendence>this.attendence && attendence>at)
		{
			return "good keep it up";
		}
		if(attendence==this.attendence)
		{
			return "okok";
		}
		return "tata bye bye";
	}		
	public static void main(String[] args)
	{
		Student s=new Student();
		System.out.println("Enter corejava attendence");
		System.out.println(s.corejava(sc.nextFloat()));
	}
}
		