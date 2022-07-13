package Javamethod;

public class chainingc {
	chainingc(){
		System.out.println("Main class constroctor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new subclass();
	}

}
class subclass extends chainingc{
	subclass(){
		System.out.println("Subclass constrocture");
	}
}
