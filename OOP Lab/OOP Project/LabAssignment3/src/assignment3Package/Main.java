package assignment3Package;
import java.util.*;


interface Employee {
 void calculateSalary();
 void displayDetails();
}

class SalariedEmployee implements Employee {
 private 
 String name;
 private 
 double monthlySalary;

 public SalariedEmployee(String name, double monthlySalary) {
     this.name = name;
     this.monthlySalary = monthlySalary;
 }

 @Override
 public void calculateSalary() {
 }

 @Override
 public void displayDetails() {
     System.out.println("Salaried Employee Details:");
     System.out.println("Name: " + name);
     System.out.println("Monthly Salary: Rs." + monthlySalary);
     System.out.println("-----------------------------");
 }
}

class HourlyEmployee implements Employee {
 private String name;
 private double hourlyRate;
 private int hoursWorked;

 public HourlyEmployee(String name, double hourlyRate, int hoursWorked) {
     this.name = name;
     this.hourlyRate = hourlyRate;
     this.hoursWorked = hoursWorked;
 }

 @Override
 public void calculateSalary() {
     double salary = hourlyRate * hoursWorked;
     System.out.println("Hourly Employee Salary Calculated: Rs." + salary);
 }

 @Override
 public void displayDetails() {
     System.out.println("Hourly Employee Details:");
     System.out.println("Name: " + name);
     System.out.println("Hourly Rate: Rs." + hourlyRate);
     System.out.println("Hours Worked: " + hoursWorked);
     System.out.println("-----------------------------");
 }
}

public class Main {
 public static void main(String[] args) {
     
     ArrayList<Employee> employees = new ArrayList<>();

     employees.add(new SalariedEmployee("Ibtisam", 5000.0));
     employees.add(new HourlyEmployee("Shafqat", 15.0, 40));

     for (Employee employee : employees) {
         employee.calculateSalary();
         employee.displayDetails();
     }
 }
}

