class A implements Runnable
{
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			if(i==26)
			{
				t1.resume();
			}
		}
	}
}
public class Mt14 implements Runnable
{
	public void run()
	{
		for(char i='a';i<='z';i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Mt14 x=new Mt14();
		A y=new A();
		Thread t1=new Thread(x,"My Thread 1");
		Thread t2=new Thread(y,"My Thread 2");
		t1.start();
		t1.suspend();
		t2.start();
	}
}
