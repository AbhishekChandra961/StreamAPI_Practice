package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Durga", "Prasad", "78982347833", 65000.00, "Panjab"));
		employees.add(new Employee("Geetesh", "Kumbalkar", "78982347833", 63000.00, "Wardha"));
		employees.add(new Employee("Raahul", "Das", "78982347833", 75000.00, "Jharkhand"));
		employees.add(new Employee("Kaavya", "Hallur", "78982347833", 85000.00, "Karnataka"));
		employees.add(new Employee("Abhishak", "Chandra", "78982347833", 55000.00, "Bengal"));
		employees.add(new Employee("Nikita", "Shah", "78982347833", 77000.00, "Uttrakhand"));
		employees.add(new Employee("Vinayak", "Garole", "78982347833", 65000.00, "Nandurbar"));
		
		Stream<Employee> stream = employees.stream();
		List<Object> firstName = employees.stream().map(i->i.getFirstName).collect(Collectors.toList());
		System.out.println(firstName);
		List<Object> lastName = employees.stream().map(i->i.getLastName).collect(Collectors.toList());
		System.out.println(lastName);
	}
}
