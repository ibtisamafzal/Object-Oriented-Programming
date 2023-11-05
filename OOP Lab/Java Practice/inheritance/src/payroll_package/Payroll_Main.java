package payroll_package;
import java.util.*;

class payroll{
	protected
	int salary;
	int bonus;
	int manager_salary;
};

class Manager extends payroll{
	public
	Scanner input = new Scanner(System.in);
	void display() {
		System.out.println("Enter Manager's Salary: ");
		salary = input.nextInt();
		System.out.println("Enter Manager's Bonus: ");
		bonus = input.nextInt();
		manager_salary=salary+bonus;
		System.out.println("Manager's Total Salary is: " + manager_salary);
		
	}
};
class HR extends payroll{
	public
	Scanner input = new Scanner(System.in);
	void display() {
		System.out.println("Enter HR's Salary: ");
		salary = input.nextInt();
		System.out.println("Enter HR's Bonus: ");
		bonus = input.nextInt();
		
		System.out.println("HR's Total Salary is: " + (salary+bonus));
	}
};
class Empl extends payroll{
	public
	Scanner input = new Scanner(System.in);
	void display() {
		System.out.println("Enter Employee's Salary: ");
		salary = input.nextInt();
		System.out.println("Enter Employee's Bonus: ");
		bonus = input.nextInt();
		
		System.out.println("Employee's Total Salary is: " + (salary+bonus));
	}
};
class Internee extends payroll{
	public
	Scanner input = new Scanner(System.in);
	void display() {
		System.out.println("Intern's Salary is: " + (manager_salary/2));
	}
};

public class Payroll_Main {
	public static void main(String[] args) {
	
		Manager m1= new Manager();
		m1.display();
		// HR h1= new HR();
		// h1.display();
		// Empl e1= new Empl();
		// e1.display();
		Internee i1 = new Internee ();
		i1.display();
	}

}
