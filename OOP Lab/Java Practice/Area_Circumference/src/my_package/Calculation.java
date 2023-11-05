package my_package;

public class Calculation {
	
	public float radius;
	
	Calculation (float radius){
		this.radius=radius;
	}
	void area(){
        System.out.println("Area = " + (3.14 * radius * radius));
    }
    void circumference(){
        System.out.println("Circumference = " + (2 * 3.14 * radius));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Calculation cal1 = new Calculation (43);
		
		cal1.area();
        cal1.circumference();
	}
}
