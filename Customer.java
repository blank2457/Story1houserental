public class Customer {
private String Name;
private String Phno;
private String Address;
private String EmailId;


public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getPhno() {
	return Phno;
}
public void setPhno(String phno) {
	Phno = phno;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getEmainId() {
	return EmailId;
}
public void setEmainId(String emailId) {
	EmailId = emailId;
}
Customer(String N,String Emai,String Add,String Phno) throws NameException
{
	try
	{
		
		if(N.length()<3)
		{
			throw new NameException("size is too small please enter again");
			
			
		}
		
		
		this.Name=N;
		this.EmailId=Emai;
		this.Address=Add;
		this.Phno=Phno;
	}
	catch (NameException e)
	{
		System.out.println(e.getMessage()); 
	}
	
	
}
{
	
}
}