package baitap.lythuyet;



public class MyClass {
	static public int x=100;
	
	static {
		x+=100;
	}
	
	static public void method() {
		x+=200;
		System.out.println(x);
	}
}
