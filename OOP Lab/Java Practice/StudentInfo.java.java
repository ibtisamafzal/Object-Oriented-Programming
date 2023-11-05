package mypackage;
import java.util.*;

class Student{
	protected
		String name;
		int reg;
		double cgpa;
		
	public
		Student(String name, int reg, double cgpa) {
			this.name=name;
			this.reg=reg;
			this.cgpa=cgpa;
		}
		void display() {
			System.out.println("Student Name is: "+name);
			System.out.println("Student Roll No is: "+reg);
			System.out.println("Student CGPA is: "+cgpa);
		}
};

class Course{
	private
		String course_name;
		String course_code;
		int credit_hours;
		Scanner in = new Scanner(System.in);
		
	public 
		void get_course_info() {
			System.out.println("Enter Course Name");
			course_name=in.nextLine();
			System.out.println("Enter Course Code");
			course_code=in.nextLine();
			System.out.println("Enter Credit Hours");
			credit_hours=in.nextInt();
		}
		void course_display() {
			System.out.println("Course Name is: "+course_name);
			System.out.println("Course Code is: "+course_code);
			System.out.println("Credit Hours are: "+credit_hours);
		}
};

public class StudentInfo {
	public static void main(String[] args) {
//		Student std1 = new Student();
//		std1.get_info();
//		std1.display();
		Student std = new Student("shafqat", 15, 3.45);
		std.display();
		Student std1 = new Student("ali", 155, 2.33);
		std1.display();
	}
}
