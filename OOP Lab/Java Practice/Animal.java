package mypackage;
import java.util.*;

class animalClass{
	protected
		String color;
		int legs;
		int eyes;
	public
		void animalDisplay() {
			System.out.println("This is a Animal Class");
		}
		
};

class Dog extends animalClass{
	public
		Scanner input = new Scanner(System.in);
		void getDoginfo() {
			System.out.println("Enter Dog color");
			color=input.nextLine();
			System.out.println("Enter Dog legs");
			legs=input.nextInt();
			System.out.println("Enter Dog eyes");
			eyes=input.nextInt();
		}
		
		void display() {
			System.out.println("Dog color is: "+color);
			System.out.println("Dog Legs are: "+legs);
			System.out.println("Dog Eyes are: "+eyes);
		}
}

public class Animal {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.animalDisplay();
		obj.getDoginfo();
		obj.display();
	}
}
