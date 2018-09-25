package org.cap.demo;

public class TestStatic {
	String name;
	static int n;
	final float pi=3.14f;
	/*Static variable can only static data while non static function can access instance and static
	 type */
	public static void show()
	{
		System.out.println("N is "+ n);
	}
	public static void main(String[] args) {
		
		TestStatic t=new TestStatic();
		System.out.println(t.name="Demon");
		TestStatic.n=10;
		System.out.println(t.n); 
		TestStatic.show();
		System.out.println(t.pi);
	
	}

}
