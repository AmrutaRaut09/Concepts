import java.lang.*;
import java.util.*;


class array1
{
    public static void main(String arg[])
    {
        int arr[][]=new int[2][3];
        arr[0][0]=21;
        arr[0][1]=51;
        arr[0][2]=101;

        arr[1][0]=2;
        arr[1] [1]=5;
        arr[1] [2]=55;       
     
        int i=0, j=0;

        for(i=0; i<arr.length;i++)
        {
                for(j=0; j<arr[i].length; j++)
                {
                    System.out.print("  ");
                    System.out.print(arr[i][j]);                
                }
                System.out.println();
        }
    }
}