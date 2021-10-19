package Intermediate_OOPs_Assignment;

import java.util.ArrayList;
import java.util.List;

class Manager extends Question2 {
    /*
    * parameterized constructor
    */
    public Manager(int empID, String fName) {
        super(empID, fName);
    }
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary + incentive;
    }
}
class Labour extends Question2 {
    /*
     * parameterized constructor
     */
    public Labour(int empID, String fName) {
        super(empID, fName);
    }
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary + overtime;
    }
}
public class Question2 {
    /*
     * method to be overridden
     */
    public int getSalary(int salary){
        return salary;
    }
    private int empID;
    private String fName;
    private static int salary = 10000;
    
    public Question2(int empID, String fName){
        this.empID = empID;
        this.fName = fName;
    }
    
    public static int totalEmployeesSalary(int employeeSalaries){
        return employeeSalaries;
    }
    public static void main(String[] args) {
        List<Integer> ar = new ArrayList<>();
       
        Question2 manager = new Manager(1, "Sagar");
        
        Question2 labour = new Labour(2, "Rahul");
       

        ar.add(totalEmployeesSalary(manager.getSalary(salary)+labour.getSalary(salary)));
        int total=0;
        for(int i : ar){
            total += i;
        }
        System.out.println("Details of Manager :"
        		+ " "+"\n\tEmployee ID : "
        				+ ""+manager.empID+
        				"\n\tFirst Name : "+
        				manager.fName+"\n\tSalary :"
        						+ " $"+manager.getSalary(salary));
        
        
        System.out.println("Details of Labour "
        		
        		+ ": "+"\n\tLabour ID :"
        				+ " "+labour.empID+
        				"\n\tFirst Name : "+labour.fName
        				+"\n\tSalary : $"+labour.getSalary(salary));
        System.out.println("Total Salary of Employees :"
        		+ " $"+total);
    }
}
