package OOP.Lab;
import java.util.*;

class Bird {
	protected
	String color;
	int age;
	int legs;

	void display()
	{
		System.out.println("This is Bird Class");
	}
	
};
class Parrot extends Bird{
	Scanner scan = new Scanner(System.in);
	
	void getParrotInfo() {
		
		System.out.println("Enter Parrot Color: ");
		color = scan.nextLine();
		System.out.println("Enter Parrot Age: ");
		age = scan.nextInt();
		System.out.println("Enter Parrot Legs: ");
		legs = scan.nextInt();
	}
	void display()
	{
		System.out.println("Parrot Color is: "+color);
		System.out.println("Parrot Age is: "+age);
		System.out.println("Parrot Legs is: "+legs);
	}
}
class Peigon extends Bird{
	Scanner scan = new Scanner(System.in);
	
	void getPeigonInfo() {
		
		System.out.println("Enter Peigon Color: ");
		color = scan.nextLine();
		System.out.println("Enter Peigon Age: ");
		age = scan.nextInt();
		System.out.println("Enter Peigon Legs: ");
		legs = scan.nextInt();
	}
	void display()
	{
		System.out.println("Peigon Color is: "+color);
		System.out.println("Peigon Age is: "+age);
		System.out.println("Peigon Legs is: "+legs);
	}
}

public class Main {

	public static void main(String[] args) {
		
		Bird b1 = new Bird();
		b1.display();
		
		Parrot pa1 = new Parrot();
		pa1.getParrotInfo();
		
		
		Peigon p1 = new Peigon();
		p1.getPeigonInfo();
		
		pa1.display();
		p1.display();
		
		
	}

}
