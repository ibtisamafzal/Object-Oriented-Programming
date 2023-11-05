package zooPackage;
import java.util.*;

class Animal{
    protected
        String Name;
        int Age;
}

class Mammal extends Animal{
    private
        String furColor;
        String Give_Birth;
    
        Scanner input=new Scanner(System.in);
    
        void getMammalInfo(){
            System.out.println("Give Mammal Information!!!");
            System.out.print("Enter Name: ");
            Name=input.nextLine();
            System.out.print("Enter Age: ");
            Age=input.nextInt();
            System.out.print("Enter Fur Color: ");
            furColor=input.next();
            System.out.print("Give Birth ? (Yes or No): ");
            Give_Birth=input.next();
        }
        void Display(){
            System.out.println("Name: "+Name);
            System.out.println("Age: "+Age);
            System.out.println("Fur Color: "+furColor);
            System.out.println("Give Birth: "+Give_Birth);
        }
}
class Birds extends Animal{
    private
        String wingSpan;
        String action;
    
    Scanner scan = new Scanner(System.in);
    
        void getBirdInfo(){
            System.out.println("Give Bird Information!!!");
            System.out.print("Enter Name: ");
            Name=scan.nextLine();
            System.out.print("Enter Age: ");
            Age=scan.nextInt();
            System.out.print("Enter Wing Span: ");
            wingSpan=scan.next();
            System.out.print("Action Perfrom: ");
            action=scan.next();
        }
        void Display(){
            System.out.println("Name: "+Name);
            System.out.println("Age: "+Age);
            System.out.println("Wing Span: "+wingSpan);
            System.out.println("Action Performed: "+action);
        }
}
public class ZooClass {
    public static void main(String arg[])
    
    {
        Mammal M1 = new Mammal();
        M1.getMammalInfo();
        M1.Display();
        
        Birds B1=new Birds();
        B1.getBirdInfo();
        B1.Display();
    }
}
