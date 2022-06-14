import java.lang.*;

class garbagecollect
{
    public static void main(String ar[])
    {
        Demo dobj = new Demo(10);
        dobj=null;
        System.gc();

        System.out.println("End of main");
	}
}

class Demo
{
	public int Arr[];
	
	public Demo(int size)
	{
		System.out.println("Allocate the resources in..");
		this.Arr=new int[size];
	}
	
    protected void finalize()
    {
        System.out.println("Deallocation the resources in finalize..");
        this.Arr=null;
    }
}
