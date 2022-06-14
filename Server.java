import java.lang.*;
import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
		BufferedReader br, brK;
		System.out.println("Server Application is running..");
		String s1,s2;
		try{
		ServerSocket ss = new ServerSocket(1100);
		Socket s = ss.accept();
		
		System.out.println("Connection Successful..");		
		
		BufferedReader brK = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps = new PrintStream(s.getOutputStream());
		while((s1 = br.readLine())!=null)
		{
			System.out.println("Client says: "+s1);
			System.out.println("Enter msg for client: ");
			s2.brK.readLine();
			ps.println(s2);
			
		}
		}
		catch(Exception obj)
		{}
			s1.close();
			ss.close();
			br.close();
			brK.close();
			ps.close();
	
	}
}