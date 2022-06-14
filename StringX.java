import java.io.*;


public class StringX
{
    public static void main(String a[])
    {
        String str1= "Hello";       //String Literals 
        String str6= "Hello";       //String Literals 
        String str2 ="World";

        System.out.println(str1);
        System.out.println(str1.length());

        String str3=str1+str2;
        System.out.println(str3);

        String str4 = new String("Hello");
        String str5 = new String("Hello");      //String Objects
        System.out.println(str4);
        System.out.println(str5);

    }
}
