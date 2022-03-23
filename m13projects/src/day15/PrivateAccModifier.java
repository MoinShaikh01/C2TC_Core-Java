package day15;

class Data {
    private String name;

    // getter method
    public String getName() {
        return this.name;
    }
    // setter method
    public void setName(String name) {
        this.name= name;
    }
}
public class PrivateAccModifier {
    public static void main(String[] main){
        Data d = new Data();

        // access the private variable using the getter and setter
        d.setName("Private Access Modifier Program Using Getter & Setter Method.");
        System.out.println(d.getName());
    }
}