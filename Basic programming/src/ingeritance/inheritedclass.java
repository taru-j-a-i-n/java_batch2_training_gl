package ingeritance;

public class inheritedclass extends Javainheritance {
	
	 inheritedclass() {
		System.out.println("Subclass constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Javainheritance();
		new inheritedclass();
		
		inheritedclass o = new inheritedclass();
		System.out.println(o.empid);
		System.out.println(o.empname);
		System.out.println(o.empcity);
		System.out.println(o.state);
		
	}

}
