package midlabpackage;

class School{
	protected
	String name;	
	String address;		
	
	School (String name, String address){
		this.name=name;
		this.address=address;
	}
	
	void display() {
	System.out.println("School Name: "+ name);
	System.out.println("School Address: "+ address);
	}
}

class Student extends School{
	
	String st_name;
	String st_gender;
	int st_ID;
	String st_birth;
	
	public String getName() {
		return st_name;
	}
	
	
	void display() {
	System.out.println("Student Name: "+ st_name);
	System.out.println("School Gender: "+ st_gender);
	System.out.println("School ID: "+ st_ID);
	System.out.println("School Birth Date: "+ st_birth);
	}
}

public class Question3 {
	public static void main(String[] args) {
	
		School s1 = new School("DPS", "OKARA");
		s1.display();

		Student st1 = new Student();
		st1.display();	
		
	}
}
