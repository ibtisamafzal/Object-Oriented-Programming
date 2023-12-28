package Final_Lab_Package;
import java.util.*;

class Accounts {
	protected
    int AccNumber;
    String AccHolderName;
    double balance;

    Accounts(int AccNumber,String AccHolderName,double balance){
    	this.AccNumber=AccNumber;
    	this.AccHolderName=AccHolderName;
    	this.balance=balance;
    }
    
    public void setValues(){
    	
    	try (Scanner input = new Scanner(System.in)) {
			System.out.println("Account No: ");
			AccNumber=input.nextInt();
			
			System.out.println("Account Holder Name: ");
			AccHolderName=input.nextLine();
			
			System.out.println("Account Balance: ");
			balance=input.nextDouble();
		}
    }
    
    public void display(){
        System.out.println("Account No: "+AccNumber);
        System.out.println("Account Holder Name: "+AccHolderName);
        System.out.println("Account Balance: "+balance);
    }
}

class CurrentAccount extends Accounts{

    CurrentAccount(int AccNumber, String AccHolderName, double balance) {
        super(AccNumber, AccHolderName, balance);
    }
    
    public void withdraw(double balance){
    	
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Amount to Withdraw: ");
            double amount = input.nextDouble();
            
            if(amount>balance){
                System.out.println("Less Balance!");
            }
            else{
                balance=balance-amount;
            }
		}
    }
    
    	public void setValues(){
    		super.setValues();
    	}
    
    	public void display(){
    		
    		super.display();
    		
    		System.out.println("You want to withdraw Money 1/0");
	        try (Scanner input = new Scanner(System.in)) {
				int choice=input.nextInt();
				
				if(choice==1){
				withdraw(choice);
      }
      
				else{
					return;
				}
			}
    }
}

class SavingAccount extends Accounts {
    protected double interestRate=0.01;
    
    SavingAccount(int AccNumber, String AccHolderName, double balance) {
        super(AccNumber, AccHolderName, balance);
    }
    
    public void CalculateInterest(double balance){
    	balance=balance*interestRate;
    	System.out.println("Balance After Interest: "+balance);
    }
    
    public void setValues(){
        super.setValues();
    }
    
    public void display(){
        super.display();
        System.out.println("Interest Rate: "+interestRate);
        CalculateInterest(balance);
    }
}

public class App {

	public static void main(String[] args) {
		
		System.out.println("Saving Account: ");
        SavingAccount s1 = new SavingAccount(111, "Ibtisam", 15000);
        s1.setValues();
        s1.display();
        
        System.out.println("Current Account: ");
        CurrentAccount c1 = new CurrentAccount(111,"Ibtisam",12000);
        c1.setValues();
        c1.display();
	}
}

