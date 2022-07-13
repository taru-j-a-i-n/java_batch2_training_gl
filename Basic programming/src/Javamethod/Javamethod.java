package Javamethod;
import java.util.*;
public class Javamethod {
	public static int fibo(int a) {
		if(a==0) {
			return 0;
		}
		if(a == 1 || a==2) {
			return 1;
		}
		
		int x= (fibo(a-1)+fibo(a-2));
		return x;
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0 ; i<=n ; i++) {
		System.out.println("Fibonacci : "+fibo(i));
		}
		
	}

}
