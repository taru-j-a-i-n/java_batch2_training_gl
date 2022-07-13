import java.util.*;

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.println("ENter the number: ");
		int num = i.nextInt();
		int temp = num;
		int x= 0;
		while(temp!=0) {
			int r = temp%10;
			x = 10*x+r;
			temp = temp/10;
			
		}
		System.out.println("the reverse number is :"+ x);


	}

}
