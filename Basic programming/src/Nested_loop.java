
public class Nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				if(j==2 && i ==2) {
					break;
				}
				System.out.println(i+" "+j);
			}
		}

	}

}
