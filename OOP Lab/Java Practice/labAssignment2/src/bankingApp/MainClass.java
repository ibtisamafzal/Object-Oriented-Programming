 package bankingApp;
import java.util.*;

class Account{
	protected
    int accountNumber;
    String accountHolderName;
    int balance;
    
    public void getAccountInfo (){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your Name: ");
        accountHolderName = scan.nextLine();
        System.out.println("What is your Account Number: ");
        accountNumber = scan.nextInt();
        System.out.println("What is your Balance : ");
        balance = scan.nextInt();
    }
    
}
class savingsAccount extends Account{
    private double interest_rate = 2.5;

    void display(){
        System.out.println("Your Name is: "+accountHolderName);
        System.out.println("Your Account Number is: "+accountNumber);
        System.out.println("Your Current Balance is: "+balance);
        System.out.println("The Interest rate is 2.5%");
        System.out.println("After Interest your Balance is: "+((balance*interest_rate/100)+(balance)));
    }
}
class current_account extends Account{
    private
	int withdrawAmount;
    int choice;
    
    void Withdraw(){
        Scanner amount= new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw: ");
        withdrawAmount = amount.nextInt();
  
        if (withdrawAmount<=balance){
            int remainingBalance = balance-withdrawAmount;
            System.out.println("Your Remaining Balance is: " + remainingBalance);
        }
        else
            System.out.println("Withdrawl Limit Exceed!");
    }

    public void display(){
        System.out.println("Your Name is: "+accountHolderName);
        System.out.println("Your Account Number is: "+accountNumber);
        System.out.println("Your Current Balance is: "+balance);
    }

}
class MainClass{
    public static void main(String[]args){

        Account Acc1 = new Account();
        int choice ;
        Scanner input = new Scanner(System.in);
        System.out.println("Which Account do you want to Open? ");
        System.out.println("Current Account or Saving Account ");
        System.out.println("For Current Account: Press (1) ");
        System.out.println("For Saving Account: Press (2) ");
        
        choice = input.nextInt();
        
        if (choice == 1){
        	current_account c1 = new current_account();
        	c1.getAccountInfo();
        	c1.display();
        	c1.Withdraw();
        	}
        
        else {
            savingsAccount s1 = new savingsAccount();
            s1.getAccountInfo();
            s1.display();
            }
    }
}
