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
	
	Student(String st_name, String st_gender, int st_ID, String st_birth){
		this.st_name=st_name;
		this.st_gender=st_gender;
		this.st_ID =st_ID;
		this.st_birth= st_birth;
	}
	
	void display() {
	System.out.println("Student Name: "+ st_name);
	System.out.println("School Gender: "+ st_gender);
	System.out.println("School ID: "+ st_ID);
	System.out.println("School Birth Date: "+ st_birth);
}
}
class Course extends School{
	String cr_name;
	int cr_code;
	int cr_hours;
	
	Course(String cr_name, int cr_code, int cr_hours){
		this.cr_name=cr_name;
		this.cr_code=cr_code;
		this.cr_hours =cr_hours;
		
	}
	
}

class Department extends Course{
	void enrollScience(){
		
	}
	
	void enrollArts(){
		
	}
	void enrollSports(){
		
	}
}

public class Question3 {
	public static void main(String[] args) {
	
		School s1 = new School("DPS", "OKARA");
		s1.display();

		Student st1 = new Student("Ibtisam","Male",73,"March");
		st1.display();
		
		
	}

}