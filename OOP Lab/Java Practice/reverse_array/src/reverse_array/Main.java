package reverse_array;

public class Main {

	public static void main(String[] args) {
		
		int [] marks= new int[5];
		marks [0] = 10;
		marks [1] = 20;
		marks [2] = 30;
		marks [3] = 40;
		marks [4] = 50;
		
		for (int i=marks.length-1; i>0; i--) {
			System.out.println(marks[i]);
		}
	}

}