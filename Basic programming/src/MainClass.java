//derived class
class Derivedclass extends MainClass{
	
	
	void add(int f,int s) {//f=first and s= second are numbers to add
		// sum of  two number
		System.out.println("Addition of two numbers are :  " +f + " + " +s +" = "+(f+s));
	}
}

// MainClass
public class MainClass {

	void evenoddcheck(int num) {//checking is the number is even or odd
		
		// check even 
		if(num%2==0) {
			System.out.println("Number is even " + num);
		}
		else {//else odd
			System.out.println("Number is odd " + num);
		}
		
	}
	void maxoftwonumber(int num1,int num2) {
		//largest between two number
		if(num1>num2) {//if 1st number is greater than the second
			System.out.println("Number1 is greater then second one " +num1);
		}
		else {// else 2nd is greater
			System.out.println("Number 2 is greater then first one " +num2);
		}
	}
	void eligibalforvoting(int age) {
											// person is eligible or not for vote
		if(age>=18) {
			System.out.println("Person is eligible for vote "+ age);
			
		}
		else {
			System.out.println("Person is not eligible for vote " + age);
		}
	}
	
	
	public static void main(String[] args) {
		
		MainClass obj=new MainClass();
		obj.evenoddcheck(19);// check if number is even or odd
		obj.maxoftwonumber(180, 85);//check max of two number
		obj.eligibalforvoting(14);//check that the age is eligible for vote or not
		
		
		Derivedclass o= new Derivedclass();//calling constructor
		
		o.add(23, 24);//calling function
 
	}

}