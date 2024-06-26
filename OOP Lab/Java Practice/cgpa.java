package Lab5package;
import java.util.*;

class cgpa_calculator{
	private
		int total_subjects;
		String course_name[];
		int marks[];
		int credit_hours[];
		double grade_gpa[];
		double subject_gpa[];
	public
		Scanner input = new Scanner(System.in);
	
		void get_subjects() {
			System.out.println("Enter the total subjects:");
			total_subjects = input.nextInt();
			course_name = new String[total_subjects];
			marks = new int[total_subjects];
			credit_hours = new int[total_subjects];
			grade_gpa = new double[total_subjects];
			subject_gpa = new double[total_subjects];
		}
		
		void getcourse_info() {
			for(int i=0; i<total_subjects; i++) {
				System.out.println("Enter Subject "+(i+1)+" Name");
				this.course_name[i] = input.next();
				System.out.println("Enter Subject "+(i+1)+" Marks");
				this.marks[i] = input.nextInt();
				System.out.println("Enter Subject "+(i+1)+" Credit Hours");
				this.credit_hours[i] = input.nextInt();
			}
		}
		
		void grade_calculation() {
			for(int i=0; i<total_subjects; i++) {
				if(marks[i]>=85) {
					grade_gpa[i]=4.00;
				}else if(marks[i]>=80 && marks[i]<85) {
					grade_gpa[i]=3.66;
				}else if(marks[i]>=77 && marks[i]<80) {
					grade_gpa[i]=3.33;
				}else if(marks[i]>=73 && marks[i]<77) {
					grade_gpa[i]=3.00;
				}
			}
		}
		
		void subject_gpa() {
			for(int i=0; i<total_subjects; i++) {
				subject_gpa[i]= credit_hours[i]*grade_gpa[i];
			}
		}
		
		double semester_gpa() {
			double sum=0;
			int total_credit_hours=0;
			for(int i=0; i<total_subjects; i++) {
				sum=sum+subject_gpa[i];
			}
			for(int i=0; i<total_subjects; i++) {
				total_credit_hours+=credit_hours[i];
			}
			return sum/total_credit_hours;	
		}
		
		void display() {
			System.out.println("Your Semester GPA is: "+semester_gpa());
		}
}

public class cgpa {

	public static void main(String[] args) {
		cgpa_calculator std1 = new cgpa_calculator();
		std1.get_subjects();
		std1.getcourse_info();
		std1.grade_calculation();
		std1.subject_gpa();
		std1.semester_gpa();
		std1.display();
	}

}
