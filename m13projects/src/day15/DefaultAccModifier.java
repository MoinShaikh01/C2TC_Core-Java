package day15;

class BaseClass 
{ 
    void display()      //no access modifier indicates default modifier
       { 
           System.out.println("BaseClass::Display with 'dafault' scope"); 
       } 
} 
 
class DefaultAccModifier
{ 
    public static void main(String args[]) 
       {   
          //access class with default scope
          BaseClass obj = new BaseClass(); 
   
          //access class method with default scope
          obj.display();
       } 
}

