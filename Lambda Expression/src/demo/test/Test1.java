package demo.test;

public class Test1 {

	public static void main(String[] args) {
		Cab cab = ()-> System.out.println("Your cab is booked");
		cab.cabBook();
	}
	
}
@FunctionalInterface	
interface Cab{
	public void cabBook();
}

/*class Ola implements Cab{

	@Override
	public void cabBook() {
		System.out.println("Your cab is booked");
		
	}
	
}*/