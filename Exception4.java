import java.lang.*;
import java.util.*;
class Exception4 
{
    public static void main(String a[])    
    {
        int iNum1=0;
        int iNum2=0;
        int iRet=0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        iNum1 = sobj.nextInt();
        System.out.println("Enter 2nd number:");
        iNum2 = sobj.nextInt();
        
        Demo dobj = new Demo();
        try{

         iRet= dobj.division(iNum1, iNum2);
         System.out.println("Division is"+iRet);
        }
        catch(ArithmeticException objj)
        {
                System.out.println("Inside catch");
        }
        
    }
}


class Demo
{
    
    int division(int no1, int no2) throws ArithmeticException
    {
        return(no1/no2);
    }
}
