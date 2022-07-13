package Javamethod;

public class Constructor {

	static int x;
	static String name= "Java is boaring";
	static String code = " Java Programming";
	static float pi= 3.14f;
	
	static void display() {
		System.out.println("STatic method");
		
	}
	void fun() {
		System.out.println("Non static method");
		System.out.println("Calling th static function");
		display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
