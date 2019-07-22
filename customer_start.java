

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
//import java.util.Scanner;
public class Start {
	static Vector<Customer> CArray=new Vector<>();
public static void main(String[] args) throws NameException {
	
	
	
	int n=1;
	
	//ArrayList<Owner> OArray = new ArrayList<Owner>();
	while(n!=0)
	{
		 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------------------------------------");
		System.out.println("Name EmainId address phno.");
		System.out.println("Enter 1 to enter details of the Owner");
		System.out.println("Enter 2 to Update the details of the Owner");
		System.out.println("Enter 3 to delete the details of the Owner");
		System.out.println("Entetr 4 to Add the details of the customer");
		System.out.println("Enter 5 to print  the Custmoers");
		System.out.println("Enter 6 to print the Owners");
		System.out.println("Enter 7 to search for the Customer");
		System.out.println("Enter 8 to search for the Owner");
		System.out.println("Enter 9 to search for the customer");
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		n=sc.nextInt();
		if(n==0)
		{
			continue;
		}
		
		switch(n)
		{
			case 1:	
				break;
			case 2:
				break;
			case 3:	
				break;
				
			case 4: 
				fun1();
				
				//CArray.add()
			
				break;
			case 5:
				int flag=CArray.size();
				
				System.out.println("Name EmainId address phno.");
				for(int i=0;i<flag;i++)
				{
					System.out.println(CArray.get(i).getName()+" "+CArray.get(i).getEmainId()+" "+CArray.get(i).getAddress()+" "+CArray.get(i).getPhno());
				}
				break;
			case 6:
				break;
			case 7:
				  NameS name = new NameS(); 
				  String s=sc.next();
			        Collections.sort(CArray, name); 
			int index = 0;
			try {
				index = Collections.binarySearch(CArray, 
                        new Customer(s, null,null,null), name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println(index);
				break;
			case 8:
				break;
			case 9:
				break;
			default:
				break;
		
	     }
		
	}
	
	
	
}

public static  void fun1() {
	
	System.out.println("enter the details");
	Scanner sc=new Scanner(System.in);
	
	String ss=sc.nextLine();

	String[] s = ss.split("\\s+");
	int k=s.length;
	
	Customer cs = null;
	try {
		cs = new Customer(s[0],s[1],s[2],s[3]);
	} catch (NameException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	CArray.add(cs);
	
	


	
	
}
}
