package lab1;

class Vehicle {
	protected
	String model_name;
	int reg_number;
	int no_of_tyres;
	
	
	public void setVehicleInfo(String a, int b, int c) {
		model_name=a;
		reg_number=b;
		no_of_tyres=c;
	}
	
	
	public String getModelName() {
		return model_name;
	}
	
	public int getReg_Number() {
		return reg_number;
	}
	
	public int getTyreCount() {
		return no_of_tyres;
	}
}

class Car extends Vehicle{
	super (model_name);
	Vehicle reg_number;
	Vehicle model_name;
	int no_of_airbags;
	String color;
	
	void setCarInfo(int a, String b) {
		this.no_of_airbags=a;
		this.color=b;
	}
	
	public int getAirbagCount() {
		return no_of_airbags;
	}
	
	public String getColor() {
		return color;
	}
}

class Truck extends Vehicle{
	Vehicle no_of_tyres;
	int import_year;
}

class Bus extends Vehicle{
	Vehicle no_of_tyres;
	int number_of_seats;
}


public class Poly_Encaps {
	public static void main(String[] args) {
		
		Car c1= new Car();
		c1.setCarInfo(20, "Honda");
		c1.getModelName();
	}

}