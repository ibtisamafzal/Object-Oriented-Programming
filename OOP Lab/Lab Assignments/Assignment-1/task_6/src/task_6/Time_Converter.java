package task_6;
import java.util.Scanner;
public class Time_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner (System.in);
	System.out.println("Enter seconds to convert: ");
	float seconds = scanner.nextInt();
	
	System.out.println("Time in Minutes: "+seconds/60);
	System.out.println("Time in Hours: "+seconds/3600);
	}
}