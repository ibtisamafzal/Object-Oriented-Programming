package midlabpackage;

class Car{
	
	String make;
	String model;
	int year;
	double price;
	int quantity;

	Car (String make, String model,int year,double price, int quantity){
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.quantity = quantity;
	}
	
	void display() {
		
		System.out.println("Car Make is:" + make);
		System.out.println("Car Model is:" + model);
		System.out.println("Car Year is:" + year);
		System.out.println("Car Price is:" + price);
		System.out.println("Car Quantity is:" +quantity);
	}
	
	void updateStock(int stock) {
		int Newquantity = quantity+stock;
		System.out.println("Updated Stock: " + Newquantity);
	}
}

public class InventoryClass {

	public static void main(String[] args) {
	
		Car c1 = new Car("Toyota","CHR", 2023, 230000, 20);
		c1.updateStock(20);
		c1.display();
		
		
		Car c2 = new Car("Honda","Civic", 2022, 320000, 10);
		c2.updateStock(5);
		c2.display();
	}

}
