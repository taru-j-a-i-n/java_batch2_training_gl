import java.util.*;
public class code3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the age ");
		int age= i.nextInt();
	
			if(age>=0 && age<10) {
				System.out.println("KID ");
			}
			if(age>=13 && age<20) {
				System.out.println("Teenager");
			}
			if(age>=25 && age<50) {
				System.out.println("Adult");
			}
			if(age>=50 && age<100) {
				System.out.println("Old age");
			}
			
			else {
				System.out.println("uncaterized");
			}
			
		i.close();
	}

}
