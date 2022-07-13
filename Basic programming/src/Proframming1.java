
import java.util.*;
public class Proframming1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = inp.nextInt();
		if(age<18) {
			System.out.println("Not Eligible ");
		}
		else {
			System.out.println("Eligible ");
		}
		inp.close();
	}
	

}
