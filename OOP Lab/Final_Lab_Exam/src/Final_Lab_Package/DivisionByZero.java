package Final_Lab_Package;
import java.util.Scanner;

interface  MathOperation {
    public void division();
}

class BasicCalculator implements MathOperation  {
   
	@Override
    public void division() {
        
        try (Scanner input = new Scanner(System.in))
        {
            System.out.println("Enter 1st Number : ");
            int x = input.nextInt();
            System.out.println("Enter 2nd Number ");
            int y = input.nextInt();
            double c = x / y;
            System.out.println("Result " + c);
        }
        
        catch (Exception e)
        {
            System.out.println("Division by zero is not allowed");
        }

    }
}

public class DivisionByZero {
    public static void main(String[] args) {
        
        BasicCalculator b1 = new BasicCalculator();
        b1.division();
    }
}
