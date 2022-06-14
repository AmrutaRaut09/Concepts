import java.lang.*;
import java.util.*;

class Exception3 
{
    public static void main(String arg[])    
    {
        int arr[]={10,20,30,40,50};
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the index:");
        int index = sobj.nextInt();
        try
        {
          System.out.println("Element at that index is:"+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException obj)
        {
            System.out.println("Inside catch");
        }
        catch(Exception obj)
        {
            System.out.println("Inside catch2");
        }
        
        finally
        {
            System.out.println("inside finally");
            sobj.close();
        }
        System.out.println("End of Application");

    }
}
