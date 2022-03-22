package day16;

abstract class MotorBike {
	  abstract void brake();
	}

	class SportsBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("SportsBike is a Motorcycle Optimized for Speed & Acceleration.");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  // implementation of abstract method
	  public void brake() {
	    System.out.println("MountainBike Climbing on the Mountains as well as Hills.");
	  }
	}

public class AbstractDemo2 {

	  public static void main(String[] args) {
	    MountainBike m1 = new MountainBike();
	    m1.brake();
	    SportsBike s1 = new SportsBike();
	    s1.brake();
	  }
	}

