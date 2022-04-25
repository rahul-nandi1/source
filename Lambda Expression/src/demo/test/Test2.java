package demo.test;

public class Test2 {

	public static void main(String[] args) {
		Cab2 cab = ( source, destination)-> System.out.println("Your cab is booked from "+source+" to "+destination);
		cab.cabBook("Tobin Road", "Esplaned");


}
}
interface Cab2{
	public void cabBook(String source, String destination);
}
	
/*class Ola implements Cab2{

	@Override
	public void cabBook(String source, String destination) {
		System.out.println("Your cab is booked from "+source+" to "+destination);		
	}

	
}*/