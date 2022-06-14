import java.lang.*;

abstract class RBI
{
	public int Balance;
	
	public RBI()			//constructor
	{
		this.Balance=0;
	}
	
	public void Credit(int Amount)
	{
		this.Balance=this .Balance+Amount;
	}
	
	public void Debit(int Amount)
	{
		this.Balance=this.Debit+Amount;
	}
	public abstract int CalculateInterest();
}
class SBI extends RBI
{
	
}

class PNB extends RBI
{
	
}

class AbstractDemo
{
	public static void main(String arg[])
	{
		
	}	
}
