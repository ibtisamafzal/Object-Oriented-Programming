package task_9;
public class Find_Duplicates 
{
public static void main(String[] args) 
{
	int []arr= {1,2,3,3,2,6};
	System.out.println("Duplicate elements found are: ");
	for(int i=0; i<arr.length; i++) 
	{
		for(int j=i+1; j<arr.length; j++) 
		{
			if(arr[i]==arr[j]) 
			{
				System.out.println(arr[j]);
			} 	
		}
	}	
}
}