package day15;

class Bike {
    // protected method
    protected void display() {
        System.out.println("Suzuki Is a Sports Bike");
    }
}

class Suzuki extends Bike {}

public class ProtectedAccModifier {
	
	public static void main(String[] args) {

        // create an object of Dog class
         Suzuki h = new Suzuki();
         // access protected method
        h.display();
    	}
	}


