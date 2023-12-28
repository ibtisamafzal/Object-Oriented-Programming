public class App {
	
    public static void main(String[] args) throws Exception {
        System.out.println("---------------Saving Account--------------");
        SavingAccount s1 = new SavingAccount();
        s1.setValues();
        s1.display();
        
        System.out.println("---------------Current Account--------------");
        CurrentAccount c1 = new CurrentAccount(111,"Ibtisam",12000);
       // c1.setValues();
        c1.display();
        }
}
