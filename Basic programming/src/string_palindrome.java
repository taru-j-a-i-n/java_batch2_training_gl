import java.util.*;
public class string_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String a= s.next();
		int p = 0;
		int q = a.length()-1;
		if(a.length()==1) {
			System.out.println("String is a palimdrom");
		}
		while(p<=q) {
			if(a.charAt(p)==a.charAt(q))
			{
				p++;
				q--;
				if(p==q || p-1==q)
				System.out.println("String is a palimdrom");
			}
			
			else {
				System.out.println("Not palimdrome");
			break;
			}
		
				
		}
		
		

	}

}
