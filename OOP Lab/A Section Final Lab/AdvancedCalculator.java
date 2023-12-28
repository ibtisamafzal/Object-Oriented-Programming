import java.util.*;

public class AdvancedCalculator implements MathOperation {

    @Override
    public void division() {
   
   
    	try (Scanner input = new Scanner(System.in)) {
    		System.out.println("Enter 1st Number : ");
    		int x=input.nextInt();
    		System.out.println("Enter 2nd Number ");
    		int y=input.nextInt();
    		
    	try {	
    		if(y==0) {
    			throw new Exception("Divide by zero is not possioble");
        
    		else{
    			double c = x/y;
    		    System.out.println("Result "+c);
    		}
    	}
    		
    	catch (Exception e) {
        System.out.println(e);
        }
    } 
}

    public static void main(String[] args) {
    AdvancedCalculator a1 = new AdvancedCalculator();
    a1.division();
}
    
}
