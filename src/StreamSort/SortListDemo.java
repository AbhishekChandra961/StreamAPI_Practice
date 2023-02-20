package StreamSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Employee.Employee;
import Employee.EmployeeDataBase;



public class SortListDemo {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(3);
		list.add(12);
		list.add(4);
		
		Collections.sort(list);//assending
		Collections.reverse(list);//desending
		System.out.println(list);
		
		
		//using streamAPI
		list.stream().sorted().forEach(s->System.out.println(s));//assendind
		list.stream().sorted(Comparator.reverseOrder()).forEach(s->System.out.println(s));//desending
		
		Collections.sort(employees, (o1,o2)->(int)(o1.getSalary() - o2.getSalary()));
		
		System.out.println(employees );
	}
}

