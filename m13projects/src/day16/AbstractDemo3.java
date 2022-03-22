package day16;

abstract class A
{
	static int c;
	private int d;
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	void a1()
	{
		System.out.println("Hello Class");
	}
	abstract void a2();
}

class B extends A
{
	void a2()
	{
		System.out.println("Hi Everyone");
	}
}

public class AbstractDemo3 {

	public static void main(String[] args) {
		B obj=new B();
		obj.a1();
		obj.a2();
		obj.setD(60);
		System.out.println(obj.getD());
		
	}

}
