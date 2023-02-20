package PracticeQuestionsStreamAPI;

import java.util.ArrayList;
import java.util.List;

import StreamSort.Employee1;

public class WorkerDataBase {

	static List<Worker> list = new ArrayList<Worker>();
	
	public static List<Worker> getWorker(){
		
		
		
		list.add(new Worker("Abhishek","Chandra","AC","ME"));
		list.add(new Worker("Roronoa","Zoro","RZ","CIVIL"));
		list.add(new Worker("Vinsmoke","Sanji","VS","IT"));
		list.add(new Worker("Sonu","Sood","SS","ME"));
		
		return list;
		
	}
}
