import java.lang.*;

class CommandLine
{
	public static void main(String Arg[])  // Arg[] is Command Line argument
	{
		System.out.println("First number is:"+Arg[0]);
		System.out.println("Second number is:"+Arg[1]);
		int ans =Integer.parseInt(Arg[0])+Integer.parseInt(Arg[1]);
		System.out.println("Addition is:"+ans);
	}
}

// javac CommandLine.java
//java CommandLine 10 11