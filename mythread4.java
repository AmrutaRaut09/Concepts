//import java.lang.*;

class mythread4
{
	public static void main(String a[])
	{
		Marvellous mobj1= new Marvellous();
		Thread t1 =new Thread(mobj1,"First");
		
		Marvellous mobj2= new Marvellous();
		Thread t2 = new Thread(mobj2,"Second");

		t1.start();
		t2.start();		
	}	
}

class Marvellous extends Thread
{
	public void run()		//Abstract method
		{
			
			for(int i=0;i<=1000;i++)
			{
				System.out.println("thread scheduled:"+Thread.currentThread().getName()+":"+i);
			}
		}
}