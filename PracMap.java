import java.util.Scanner;
import java.util.TreeMap;

public class PracMap {

	private void nain() {
		// TODO Auto-generated method stub

System.out.println("Enter c for customers resgistration ");
System.out.println("Enter o for owner registration");
	
	TreeMap<String, String[]> Cmap = new TreeMap<String, String[]>(); 
	
	TreeMap<String,  String[]> Omap = new TreeMap<String,  String[]> (); 
	
	
	while(true)
	{
	
	System.out.println("enter the username ");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String s1=sc.next();
	try
	{
	if(s.length()<3)
	{
		throw new NameException("Username is too small please enter again");
		
		
	}
	}
	catch(NameException e)
	{

		System.out.println(e.getMessage());
	}
	try
	{
	if(s1.length()<7)
	{
		throw new NameException("Password is too small please enter again");
	}
	}
	catch(NameException e)
	{
		System.out.println(e.getMessage());
	}
	
	
	
	
}
}
}
