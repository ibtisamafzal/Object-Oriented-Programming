package task_2;

public class Sum_Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		int sum=0;

		while (count < 100) {
			for (int i= 2; i <= 100; i++)
		{
			int temp=0;
			for (int j = 2; j <= i-1; j++) {
	    		if (i % j == 0){		
	    			temp=temp+1;		
	                }
	            }
	    	if (temp == 0) {
	    		sum =sum+i;
	    		count++;
	            }
		}
			}  
		System.out.print("The sum of first 100 Prime numbers is: "+sum);   
	}
	}


	

			

        
