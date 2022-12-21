package test;

class A {
	
   void fun() {
		System.out.println("jsf");
	}
	
}

public class Child extends A{
	
	
	void fun() {
		System.out.println("child");
	}

	public static void main(String[] args) {
		A c = new Child();
		c.fun();
		

	}

}
