import java.util.*;

public class Accounts {
    protected
        int accountNumber;
        String accountHolderName;
        double balance;
        Accounts(){

        }

    Accounts(int accountNumber,String accountHolderName,double balance){
    	this.accountNumber=accountNumber;
    	this.accountHolderName=accountHolderName;
    	this.balance=balance;
    }
    
    public void setValues(){
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Account No: ");
        accountNumber=input.nextInt();
        System.out.println("Account Holder Name: ");
        input.nextLine();
        accountHolderName=input.nextLine();
        System.out.println("Account Balance: ");
        balance=input.nextDouble();
    }
    }
    public void display(){
        System.out.println("Account no. : "+accountNumber);
        System.out.println("Account Holder Name : "+accountHolderName);
        System.out.println("Account Balance : "+balance);
    }
}
