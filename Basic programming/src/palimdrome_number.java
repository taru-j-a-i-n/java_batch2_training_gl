import java.util.*;
public class palimdrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the num");
		int num = n.nextInt();
		int temp = num;
		int x =0;
		while(temp!=0) {
			
			int r = temp%10;
			x=10*x+r;
			temp = temp/10;
			
		}
		if(x==num) {
			System.out.println("num is palimdrom");
		}
		else {
			System.out.println("num is not palimdrom");
		}
		
		

	}

}
