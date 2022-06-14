import java.lang.*;
import java.util.*;

class HT
{
  public static void main(String arg[])	
  {
	  //Integer is key
	  Hashtable <Integer,String>obj=new Hashtable<Integer,String>();
	  
	  obj.put(11,"Amit");
	  obj.put(21,"Piyush");
	  obj.put(51,"Mayur");
	  obj.put(30,"Mayur");
	  obj.put(2,"Mayur");
	  obj.put(111,"Dinesh");
	  
	  System.out.println("Paduka aalya..."+obj.get(21));
	  System.out.println("s"+obj.get(111));
	  System.out.println("Data from Hashtable");
	  Enumeration eobj = obj.keys();
	  
	  while(eobj.hasMoreElements())
	  {
		  System.out.println(eobj.nextElement());		  
	  }
	}
}