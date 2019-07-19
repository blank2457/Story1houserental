import java.util.Comparator;

public class NameS implements Comparator<Customer> {

	@Override
	public int compare(Customer a1, Customer a2) {
		// TODO Auto-generated method stub
		
		 return a1.getName().compareTo(a2.getName()); 
	
	}

}
