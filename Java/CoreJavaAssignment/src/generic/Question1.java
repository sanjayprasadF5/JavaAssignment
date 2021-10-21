package generic;

import java.util.HashSet;
import java.util.Set;

import generic.Question1.Employee;

public class Question1 {
	public static void main(String[] args) {
		Set<Employee> employee = new HashSet<>(); 
		employee.add(new Employee(1, "Employee1", 40000));
		employee.add(new Employee(2, "Employee2", 80000));
		employee.add(new Employee(3, "Employee3", 60000));
		
		System.out.println("total number of employee: "
		+employee.size());
		for(Employee p: employee)
		System.out.println(p);
		
	}
}
