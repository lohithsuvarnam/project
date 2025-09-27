class A implements Runnable
{
	Thread t1;
	A(Thread t1)
	{
		this.t1=t1;
	}
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			if(i==50)
			{
				t1.resume();
			}
		}
	}
}
class B implements Runnable
{
	Thread t2;
	B(Thread t2)
	{
		this.t2=t2;
	}

	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
			if(i==151)
			{
				t2.resume();
			}
		}
	}
}
class Mt15 implements Runnable
{
	public void run()
	{
		for(int i=201;i<=300;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	{
		Mt15 x=new Mt15();
		Thread t1=new Thread(x);
		A y=new A(t1);
		Thread t2=new Thread(y);
		B z=new B(t2);
		Thread t3=new Thread(z);
		t1.start();
		t1.suspend();
		t2.start();
		t3.start();
		t3.suspend();
	}
}