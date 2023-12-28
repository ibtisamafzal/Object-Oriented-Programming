package task_8;
public class Reverse_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,4,6,8,10,12};
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i] +" ");
		}
		System.out.println();
		int i=0, j=arr.length-1;
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		
		for(i=0; i< arr.length; i++) {
			System.out.print(+arr[i]+" ");
		}
	}
}
