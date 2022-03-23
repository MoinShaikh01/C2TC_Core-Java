package day15;

class Bakery {
    // public variable
    public int bakery;

    // public method
    public void display() {
        System.out.println("Bakery by 'Tasty Bakers'");
        System.out.println("There Are " + bakery + " Outlets in the Whole Country.");
    }
}

// Main.java
public class PublicAccModifier {
    public static void main( String[] args ) {
        // accessing the public class
        Bakery cake = new Bakery();

        // accessing the public variable
        cake.bakery = 25;
        // accessing the public method
        cake.display();
    }
}
