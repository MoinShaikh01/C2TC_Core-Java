package day16;

abstract class Bike{
	abstract void run();
}
class Honda extends Bike{
	public void run()
	
	{
	
		System.out.println("Honda Bike is Running");
	
	}
	
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		
	Honda h = new Honda();
	h.run();

	}

}
