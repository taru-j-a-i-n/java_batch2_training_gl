//inheritance with constructor

class JavaTraining extends iwc{
	//derived class
	String subject= "Java Training ";
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
}

public class iwc {
	//class data members 
	String designation = "Traineee Software Engineer";
	String institute="Globallogic ";
	
	public String getDesignation() {
			return designation;
		
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	
	public String getInstitute() {
		return institute;
	
}
public void setInstitute(String institute) {
	this.institute=institute;
}
	
void display() {
	System.out.println("Technical Training.....");
}
	
	public static void main(String[] args) {
		JavaTraining o = new JavaTraining();
		System.out.println("My desgination is : "+o.designation);
		System.out.println("I belong to organization: "+ o.institute);
		System.out.println("I got training in: "+ o.subject);
		
	}

}
