class Student extends InheritanceC{

	public Student(int roll, String name, String city, String state) {
		super(roll, name, city, state);
		// TODO Auto-generated constructor stub
	}
	
	
}
public class InheritanceC {
	int roll ;
	String name;
	String city, state;
	
	

	public InheritanceC(int roll, String name, String city, String state) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.state = state;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student o =new Student(101, "Taru", "Jabalpur", "MP");
		System.out.println(o.roll);
		System.out.println(o.name);
		System.out.println(o.city);
		System.out.println(o.state);

	}

}
