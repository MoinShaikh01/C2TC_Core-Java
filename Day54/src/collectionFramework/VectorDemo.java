package collectionFramework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("MShaikh");
		String s2 = new String("MShaikh");
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v1.contains(e2));*/
		Employee e1 = new Employee(1, "MShaikh", 10000);
		Employee e2 = new Employee(1, "MShaikh", 10000);
		
		HashSet hs1 = new HashSet();
		hs1.add(e1);
		System.out.println(hs1.contains(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}

}
