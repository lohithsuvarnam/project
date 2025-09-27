import java.util.Scanner;
class Student1
{
	String name;
	int id;
	float marks;
	Student1(String name, int id, float marks)
	{
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	public String toString()
	{
		return name+" "+id+" "+marks;
	}
}
class A
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			Student1 s1=new Student1("root",1,56.36f);
			Student1 s2=new Student1("cook",2,86.36f);
			Student1 s3=new Student1("roy",3,96.36f);
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(s3);
	}

}

