import java.lang.*;
import java.io.*;

public  class input2
{
    public static void main(String ar[])
    {
        InputStreamReader iobj = new InputStreamReader(System.in);
        BufferedReader bobj = new BufferedReader(iobj);
        
        try
        {

        System.out.println("Enter String");
        String str = bobj.readLine();

        System.out.println("Enter Integer");
        int no = Integer.parseInt(bobj.readLine());

        System.out.println("Enter Float");
        float f = Float.parseFloat(bobj.readLine());

        System.out.println("Enter Double");
        double d = Double.parseDouble(bobj.readLine());

        System.out.println("String is ="+str);
        System.out.println("Integer is ="+no);
        System.out.println("Float is ="+f);
        System.out.println("Double is ="+d);
        }
        catch(IOException e)
        {

        }
    }    
}
