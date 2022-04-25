package demo.test;

public class Test3 {

	public static void main(String[] args) {
	Cab3 cab = ( source,  destination)-> { System.out.println("Your cab is booked from "+source+" to "+destination);	
		return ("Price: 350");
	};
	
	System.out.println(cab.cabBook("Tobin Road", "Barasat"));
   }
}
interface Cab3{
	public String cabBook(String source, String destination);
}

/*class Ola implements Cab3{

	@Override
	public String cabBook(String source, String destination) {	
	System.out.println("Your cab is booked from "+source+" to "+destination);	
	return ("Price: 300");
	}
	
}*/