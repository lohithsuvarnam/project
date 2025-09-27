class A implements Runnable
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			System.out.println(i);
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
		t2.start();
		t3.start();
		t1.start();
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		System.out.println(t1.isAlive());
	}
}