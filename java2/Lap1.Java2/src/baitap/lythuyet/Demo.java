package baitap.lythuyet;

public class Demo {
	public static void main(String[] args) {
		myClass obj=new myClass();
		
		obj.meth1();
		obj.meth2();
		obj.meth3();
	}
}

interface A {
	void meth1();

	void meth2();
}

interface B extends A {
	void meth3();
}

class myClass implements B {

	
	public void meth1() {
		System.out.println("Implements method 1");
		
	}

	
	public void meth2() {
		System.out.println("implements method 2");
		
	}

	@Override
	public void meth3() {
		System.out.println("implements method 3");
		
	}
			
}
