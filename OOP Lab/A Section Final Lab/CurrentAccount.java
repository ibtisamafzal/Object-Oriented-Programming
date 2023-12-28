import java.util.Scanner;

public class CurrentAccount extends Accounts{

    CurrentAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    CurrentAccount(){
        
    }
    
    public void withdraw(double balance){
    	
        try (Scanner input = new Scanner(System.in)) {
           
            System.out.println("Enter Amount to Withdraw ");
            double amount = input.nextDouble();
            
            if(amount>balance){
                System.out.println("Less Balance");
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
        
        Scanner input = new Scanner(System.in);
        int choice=input.nextInt();
        
        if(choice==1){
        withdraw(choice);
       }
        
       else{
        return;
       }
    }
}
