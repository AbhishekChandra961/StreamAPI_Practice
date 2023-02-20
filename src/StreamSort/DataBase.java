package StreamSort;

import java.util.ArrayList;
import java.util.List;

import Employee.Employee;

class Database{
	
	public static List<Employee1> getEmployees(){
		
		List<Employee1> list = new ArrayList<>();
		
		list.add(new Employee1(176,"Roshan","IT",600000));
		list.add(new Employee1(388,"Bikash","CIVIL",900000));
		list.add(new Employee1(470,"Bimal","DEFENCE",500000));
		list.add(new Employee1(624,"Sourav","CORE",400000));
		list.add(new Employee1(176,"Prakash","SOCIAL",1200000));
		return list;
		
		
	}
}
