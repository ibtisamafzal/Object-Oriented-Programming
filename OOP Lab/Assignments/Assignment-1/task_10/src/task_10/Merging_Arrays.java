package task_10;
import java.util.Arrays;
public class Merging_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,2,3};
		int [] b = {4,5,6};
		int [] c = new int[a.length + b.length];
		for (int i=0; i<a.length; i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			c[i + a.length] = b[i];
		}
		System.out.println(Arrays.toString(c));
	}
}
