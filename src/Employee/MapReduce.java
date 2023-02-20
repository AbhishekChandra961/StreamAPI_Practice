package Employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class MapReduce {

	public static void main(String[] args) {
		
		//get employee whose grade is A
		//get salary of those
		double avgSalary = EmployeeDataBase.getEmployees().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary())
				.mapToDouble(i->i)
				.average().getAsDouble();
		System.out.println(avgSalary);
		
		//Sumof salary whose grade is A
		double sumSalary = EmployeeDataBase.getEmployees().stream()
				.filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary())
				.mapToDouble(i->i)
				.sum();
		System.out.println(sumSalary);
			
		
	}
}
/*
class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return (int) (o1.getSalary()-o2.getSalary());
	}

	
	
}*/
