package Final_FinalPackage;

class Animal{
	protected
	String Name;
	int age;
	
	public void makeSound() {
		System.out.println("This is Animal Class");
		System.out.println();
	}
};

class Mammal extends Animal{
	protected
	String fur;
	
	Mammal(String Name, int age, String fur ){
		this.Name = Name;
		this.age = age;
		this.fur = fur;
	}
	
	@Override
	public void makeSound() {
		System.out.println("This is Mammal Class");
		System.out.println("Name: " + this.Name);
		System.out.println("Age: " + this.age);
		System.out.println("Fur: " + this.fur);
		System.out.println();
		
	}
}

class Bird extends Animal{
	String fly;
	
	Bird (String Name, int age, String fly ){
		this.Name = Name;
		this.age = age;
		this.fly = fly;
	}
	
	@Override
	public void makeSound() {
		System.out.println("This is Bird Class");
		System.out.println("Name: " + this.Name);
		System.out.println("Age: " + this.age);
		System.out.println("Type: " + this.fly);
		System.out.println();
	}
}

class Fish extends Animal{
	String color;
	
	Fish (String Name, int age, String color ){
		this.Name = Name;
		this.age = age;
		this.color = color;
	}
	
	@Override
	public void makeSound() {
		System.out.println("This is Fish Class");
		System.out.println("Name: " + this.Name);
		System.out.println("Age: " + this.age);
		System.out.println("Color: " + this.color);
		
		
	}
}

public class AnimalKindom {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.makeSound();
		
		Mammal m1 = new Mammal("Markhor", 2, "No Fur");
		m1.makeSound();
		
		Bird b1 = new Bird("Parrot", 1, "Yes");
		b1.makeSound();
		
		Fish f1 = new Fish("Selmon", 1, "Grey");
		f1.makeSound();
	}

}
