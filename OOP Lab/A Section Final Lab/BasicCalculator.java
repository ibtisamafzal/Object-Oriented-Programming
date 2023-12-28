import java.util.Scanner;

interface  MathOperation {
public void division();
    
}
public class BasicCalculator implements MathOperation  {
	@Override
	public void division() {
	
	try (Scanner input = new Scanner(System.in)) {
		
		System.out.println("Enter 1st Number : ");
		int x=input.nextInt();
		System.out.println("Enter 2nd Number ");
		int y=input.nextInt();
		
		try {
        double c = x/y;
        System.out.println("Result "+c);
		} 
       
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
	
public static void main(String[] args) {
	BasicCalculator b1 = new BasicCalculator();
    b1.division();
    }    
}
