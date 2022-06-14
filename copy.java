import java.lang.*;

class copy
{
    public static void main(String ar[])
    {
		employee eobj = new employee(11,"Amruta",25000);
		System.out.println("E_ID:"+eobj.EID+ "    Name:" +eobj.eName+ "    Salary:" +eobj.ESalary);
			
			employee eobj2=(employee)eobj.clone();
		System.out.println("E_ID:"+eobj2.EID+ "    Name:" +eobj2.eName+ "    Salary:" +eobj2.ESalary);
	}
}

class employee implements Cloneable
{
	public int EID;
	public String eName;
	public int ESalary;
	
	public employee(int id, String str, int no)
	{
		this.EID=id;
		this.eName=str;
		this.ESalary= no;
	}
	
	public Object.clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}

