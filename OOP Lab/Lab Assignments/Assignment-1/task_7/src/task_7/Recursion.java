package task_7;
import java.util.Scanner;
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner start = new Scanner (System.in);
		System.out.print("Enter a starting number: ");
		int n = start.nextInt();
		for(int i=n; i>=0; i--) {
		if (n>=0) {
			n--;
			System.out.print(+i + " ");
		}
		}
	}
}
