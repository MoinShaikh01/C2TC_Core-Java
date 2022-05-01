package collectionFramework;

import java.util.Vector;

public class VectorDemo3 {
  public static void main(String[] args) {
     // Create a Vector
     Vector<String> vector = new Vector<String>();
 
     //Add elements to Vector
     vector.add("Moin");
     vector.add("Shahud");
     vector.add("Aniket");
     vector.add("Chetan");
     vector.add("Rohit");
 
     //Setting up the size greater than current size
     vector.setSize(10);
     System.out.println("Vector size: "+vector.size());
     System.out.println("Vector elements: ");
     for(int i=0; i < vector.size(); i++){
        //get(i) method fetches the element from index i
        System.out.println(vector.get(i));
     }
 
     //Setting up the size less than current size
     vector.setSize(4);
     System.out.println("\nVector size: "+vector.size());
     System.out.println("Vector elements: ");
     for(int i=0; i < vector.size(); i++){
        System.out.println(vector.get(i));
     }
  } 
}