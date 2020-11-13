Explain method Overloading with two example

Definition:2 methods having same signature but there is difference in the parameter.
Example:
1.public class Cricket
{
	
	
	public static void team(String players)
	{
		
		System.out.println("invoked team");
		System.out.println("arg players: "+players);
		
	}
	//chnage in parameter
	//no of parameters
	//change in data type of the parameters
	//change in sequence of parameters
	public static void team(String captain ,String noOfOvers)
	{
		System.out.println("invoked team with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 captain"+captain);
		System.out.println("arg2 noOfOver"+noOfOvers);
		
	}
	
	public static void team(String captain,int noOfOvers)
	{
		
		System.out.println("invoked team with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 captain"+captain);
		System.out.println("arg2 noOfOvers"+noOfOvers);
	}
	
	public static void team(int noOfOvers,String captain)
	{
		System.out.println("invoked team with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 noOfOvers"+noOfOvers);
		System.out.println("arg2 captain"+captain);
		
	}
	
	
	
}
public class CricketTester{


public static void main(String[] ground)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+ground.length);	
        
		String name="ViratKohli";
		Cricket.team(name);

		Cricket.team(name,6);
		
		Cricket.team(name,20);


	System.out.println("EXIT :: main");	
}

}

2.public class Server
{
	
	
	public static void client(String socket)
	{
		
		System.out.println("invoked client");
		System.out.println("arg socket: "+socket);
		
	}
	//chnage in parameter
	//no of parameters
	//change in data type of the parameters
	//change in sequence of parameters
	public static void client(String address,String IpPort)
	{
		System.out.println("invoked client with two parameters ");
		System.out.println("String and String");
		System.out.println("arg1 address"+address);
		System.out.println("arg2 IpPort"+IpPort);
		
	}
	
	public static void client(String address,int IpPort)
	{
		
		System.out.println("invoked client with two parameters ");
		System.out.println("String and int");
		System.out.println("arg1 address"+address);
		System.out.println("arg2 IpPort"+IpPort);
	}
	
	public static void client(int IpPort,String address)
	{
		System.out.println("invoked client with two parameters ");
		System.out.println("int and String");
		System.out.println("arg1 IpPort"+IpPort);
		System.out.println("arg2 address"+address);
		
	}
	
	
	
}
public class ServerTester{


public static void main(String[] connections)
{
	System.out.println("JVM invoked main");	
	System.out.println("main method args length"+connections.length);	
        
		String name="TCP";
		Server.client(name);

		Server.client(name,2);
		
		Server.client(name,80);


	System.out.println("EXIT :: main");	
}

}
