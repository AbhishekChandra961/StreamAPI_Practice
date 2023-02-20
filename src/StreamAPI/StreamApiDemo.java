package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApiDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Durga", "Prasad", "78982347833", 65000.00, "Panjab"));
		employees.add(new Employee("Geetesh", "Kumbalkar", "78982347833", 63000.00, "Wardha"));
		employees.add(new Employee("Raahul", "Das", "78982347833", 75000.00, "Jharkhand"));
		employees.add(new Employee("Kaavya", "Hallur", "78982347833", 85000.00, "Karnataka"));
		employees.add(new Employee("Abhishak", "Chandra", "78982347833", 55000.00, "Bengal"));
		employees.add(new Employee("Nikita", "Shah", "78982347833", 77000.00, "Uttrakhand"));
		employees.add(new Employee("Vinayak", "Garole", "78982347833", 65000.00, "Nandurbar"));
		
		//find list of emp contain substring aa or ee and salary greater that 70000.00
		employees.stream().filter(emp -> (emp.getFirstName().contains("ee") || emp.getFirstName().contains("aa")))
			.filter(emp -> emp.getSalary() > 70000.00).forEach(emp -> System.out.println(emp));
		
		//find total salary of all employee
		System.out.println("Total Salary : ");
		double totalSalary = employees.stream().mapToDouble(emp -> emp.getSalary())
			.reduce(0, (a,b) -> a+b);
		
		System.out.println(totalSalary);
		
		List<Employee> sortedList = employees.stream().sorted((emp1, emp2) -> emp1.getFirstName().compareTo(emp2.getFirstName())).collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);
		
		
		Optional<Employee> result = employees.stream().max((emp1, emp2) -> Double.valueOf(emp1.getSalary()).compareTo(Double.valueOf(emp2.getSalary())));
		
		System.out.println();
		System.out.println(result.get());
		
	}
}
