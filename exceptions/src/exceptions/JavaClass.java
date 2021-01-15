package exceptions;

import java.util.ArrayList;
import java.util.List;

public class JavaClass  {

	List<Integer> list = new ArrayList<>();
	boolean x=false;
	
	//int index=-1;
	public List<Integer> run1() throws CustomExceptions {
		addValues();
		
		System.out.println("values added in list");
		
		list.stream().forEach(l->{
			if(x) {
				list.add(l-2,404);
				x=false;
			}
		//for(Integer l: list) {
			try {
			if(40/l==0) {
				list.set(4,404);
				//throw new CustomExceptions("error caught","400");
				throw new Exception();
			}
			System.out.println("list value "+l);	//index++;
			}catch(Exception e) {
				System.out.println("exception " +l);
				//updateList(list);
				list.set(4, 404);
				return;
			}
		//}
		});

		
		return list;
	}
	
	
	public void run() throws CustomExceptions {
		addValues();
	list.stream().forEach(l->{
		System.out.println("list value "+l);	//index++;
	});
	}
	
	public List<Integer> updateList(List<Integer> l){
		
		l.set(4,404);
		
		return l;
	}
	
	
	private void addValues() {
		list.add(9);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(0);
		list.add(6);
		list.add(7);
		list.add(8);
	}
}

		
