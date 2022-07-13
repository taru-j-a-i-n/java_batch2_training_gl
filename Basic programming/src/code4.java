import java.util.Scanner;

public class code4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i= new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = i.nextInt();
		System.out.println("Enter b : ");
		int b = i.nextInt();
		if(a==b) {
			System.out.println("Numbers are equal ");
			
		}
		else {
			System.out.println("Numbers are unequal");
		}
		
		i.close();

	}

}
