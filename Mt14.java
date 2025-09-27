class A implements Runnable
{
	Thread t1;
	A(Thread t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		for(int i=0;i<=50;i++)
		{
			System.out.println(i);
			if(i==26)
			{
				t1.resume();
			}
		}
	}
}
class Mt14 implements Runnable
{
	public void run()
	{
		for(char i='A';i<='Z';i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		Mt14 x=new Mt14();
		Thread t1=new Thread(x,"My Thread 1");
		A y=new A(t1);
		Thread t2=new Thread(y,"My Thread 2");
		t1.start();
		t1.suspend();
		t2.start();
	}
}
