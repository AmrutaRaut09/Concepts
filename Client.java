import java.lang.*;
import java.net.*;
import java.io.*;

class Client 
{
	public static void main(String args[])throws Exception
	{
		System.out.println("Client Application is running..");
		String s1,s2;		
	
		
		Socket s = new Socket("localhost", 1100);
			
		BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(s.getOutputStream());
		while(!(s1 = brK.readLine()).equals("gn"))
		{
			ps.println(s1);
			s2=br.readLine();
			System.out.println("Servere says"+s2)	;
			System.out.println("enter msg for server:")	;		
				
		}
		s1.close();
		br.close();
		brK.close();
	}
}









