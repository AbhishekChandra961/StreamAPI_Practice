package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//class Calculation implements ICalculation {
//
//	@Override
//	public int add(int x, int y) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//	
//}

public class Demo {

	public static void main(String[] args) {
	
		Predicate<Integer> predicate = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				if(t%2==0){
					return true;
				}
				return false;
			}
		};
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(2);
		list.add(51);
		list.add(62);
		list.add(83);
		list.add(94);
		list.add(25);
		
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
		list.forEach(t -> {
			if(t%2==0){
				System.out.println(t+" is Even");
			}else{
				System.out.println(t+" is odd");
			}
		});
	
		
		Stream<Integer> stream = list.stream();
//		List<Integer> evenList = stream.filter(data->data%2==0).collect(Collectors.toList());
		
//		System.out.println(evenList);
		
//		int sum = evenList.stream().reduce(0, (a,b)->a+b).intValue();
		
		int sum = stream.filter(data->data%2==0)
				.reduce(0, (a,b)->a+b)
				.intValue();
		System.out.println(sum);
	}
}

