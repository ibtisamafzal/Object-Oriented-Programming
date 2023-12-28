public class SavingAccount extends Accounts {
    protected double interestRate=0.01;
   
    SavingAccount(){

    }
    
    SavingAccount(int accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }
    public void CalculateInterest(double balance){
     balance=balance*interestRate;
     System.out.println("Balance After Interest Rate : "+balance);

    }
    public void setValues(){
        super.setValues();
    }
    public void display(){
        super.display();
        System.out.println("Interest Rate : "+interestRate);
        CalculateInterest(balance);
    }
}
