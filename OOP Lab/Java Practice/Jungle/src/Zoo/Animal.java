package Zoo;

public class Animal {
	protected
	String name;
	int age;
	
	void display () {
		System.out.println("This is Animal Class.");
	}
	
class Dog extends Animal
{
	void getDogInfo() 
	{
		name="Jack";
		age=1;
	}
	void display() 
	{
		System.out.println("Name of Dog is:" + name);
		System.out.println("Age of Dog is:" + age);
	}
}
	
class Cat extends Animal {
		void getCatInfo() {
			name="Cocoa";
			age= 2;
		}
		void display() {
			System.out.println("Name of Cat is:" + name);
			System.out.println("Age of Cat is:" + age);
		}
	}
	
	
	public static void main(String[] args) {
		
		Animal a1 = new Animal ();
		a1.display();
		
		Dog d1 = new Dog ();
		d1.display();
		
		Cat c1 = new Cat ();
		c1.display();
	}

}