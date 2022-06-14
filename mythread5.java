import java.lang.*;

class mythread5
{
	public static void main(String a[]) throws Exception
	{
		Demo dobj = new Demo();
		Demo dobj2=	new Demo();
		Thread t1 = new Thread(dobj,"first");
		Thread t2 = new Thread(dobj2,"second");
		t1.start();
		t1.join();

		t2.start();
	}
}

class Demo extends Thread
{
	public void run()
		{
			for(int i=0; i<10;i++)			
			{
				System.out.println("value of i:"+Thread.currentThread().getName()+":"+i);
				try
				{
					Thread.sleep(1000);	// waiting state
				}
				catch(Exception obj)
				{

				}				
			}
		}
}
