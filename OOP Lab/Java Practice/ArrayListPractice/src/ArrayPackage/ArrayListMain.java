package ArrayPackage;
import java.util.*;

class Student 
{
    String name;
    String city;
    int regNo;

    public Student(String name, String city, int regNo) 
    {
        this.name = name;
        this.city = city;
        this.regNo = regNo;
    }
}

public class ArrayListMain {

	public static void main(String[] args) {
		
		Student s1 = new Student ("Mukarram", "Okara", 94);
        Student s2 = new Student("Zaid", "PakPattan", 87);
        Student s3 = new Student("Uzair", "Sahiwal", 103);
        Student s4 = new Student("Salman", "Sahiwal", 104);
        Student s5 = new Student("Musab", "Okara", 95);

        ArrayList<Student> list = new ArrayList<Student>();
        
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);
        
        Iterator<Student> i = list.iterator();
        
        while(i.hasNext()){
           Student data = i.next();
           if(data.city == "Sahiwal"){
           System.out.println("Name: "+ data.name+ ", Reg: "+ data.regNo + ", City: " + data.city);
           }
        }  
    }
}
