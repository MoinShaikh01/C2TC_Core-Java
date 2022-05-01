package collectionFramework;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		Vector v2 = new Vector();
		String s1 = new String("MShaikh");
		String s2 = new String("MShaikh");
		Employee e1 = new Employee(1, "MShaikh", 10000);
		Employee e2 = new Employee(1, "MShaikh", 10000);
		v1.add(s1);
		v2.add(e1);
		System.out.println(v1.contains(s2));
		System.out.println(v1.contains(e2));
	}

}

class MyVector implements Collection {
	MyVector mv = new MyVector();
	{
		mv.add("A");
		mv.add("AB");
		mv.add("ABC");
		mv.add("ABCD");
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Object[] toArray(Object[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean add(Object e) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean containsAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean addAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean removeAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean retainAll(Collection c) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}
}