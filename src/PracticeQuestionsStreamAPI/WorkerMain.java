package PracticeQuestionsStreamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class WorkerMain {

	public static void main(String[] args) {
		
		//WorkerDataBase obj = new WorkerDataBase();
		List<Worker> list1 = new ArrayList<>();
		list1 = WorkerDataBase.getWorker();								//
		
		//Q1: Write an java program to fetch "First Name" from worker list using the alias name as worker name
		list1.stream()
				.filter(n->n.getAlias().contains("AC"))
				.forEach(n->System.out.println(n.getFirstName()));
				
		//Q2: to fetch "First Name "form worklist in uppercase
		List<String> firstNameList = list1.stream()
				.map(n->n.getFirstName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(firstNameList);
		
		//Q3: to fetch unique value of Department from worklist
		List<String> departmentList = list1.stream()
				.map(n->n.getDept())
				.distinct()
				.collect(Collectors.toList());
		System.out.println(departmentList);
		
		//Q4: to print the first three characters of First Name from worklist
		List<String> firstThreeLetter = list1.stream()
				.map(n->n.getFirstName().substring(0,3))
				.collect(Collectors.toList());
		System.out.println(firstThreeLetter);
		
		//Q5:  to find the position of the alphabet (‘a’) in the first name column ‘Abhishek’ from Worker list.
		list1.stream()
		.filter(n->n.getFirstName().matches("Roronoa"))
		.map(data->data.getFirstName().indexOf('R'))
		.forEach(i->System.out.println(i+1));
		
		//Q6: to print the FIRST_NAME from Worker list after removing white spaces from the right side.
		list1.stream()
		.map(data->data.getFirstName().trim())
		.forEach(data->System.out.println(data));

		//Q7: to print the DEPARTMENT from Worker list after removing white spaces from the left side.
		list1.stream()
		.map(data->data.getDept().trim()).forEach(data->System.out.println(data));
		
		//Q8: fetches the unique values of DEPARTMENT from Worker list and prints its length. 
		List<Integer> depart = list1.stream()
		.map(data->data.getDept().toString().length())
		.collect(Collectors.toList());
		System.out.println(depart);
		
		//Q9: to print the FIRST_NAME from Worker list after replacing ‘a’ with ‘A’.
		list1.stream()
		.map(data->data.getFirstName().replace('a', 'A'))
		.forEach(data->System.out.println(data));
		
		//Q10: to print the FIRST_NAME and LAST_NAME from Worker list into a single column COMPLETE_NAME. A space char should separate them.
		list1.stream()
		.map(data->data.getFirstName().concat(data.getLastName()))
		.forEach(data->System.out.println(data));
		
		//Q11: to print all Worker details from the Worker list order by FIRST_NAME Ascending.
		list1.stream()
		.map(data->data.getFirstName())
		.forEach(data->System.out.println(data));
		
		//Q12: to print all Worker details from the Worker list order by FIRST_NAME Ascending and DEPARTMENT Descending.
		
		/*list1.stream()
		.map(data->(data.getFirstName())
		
		.forEach(data->System.out.println(data));*/
	}
}