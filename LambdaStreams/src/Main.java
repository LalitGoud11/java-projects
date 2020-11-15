import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {	
		//My dummy example
		List<String> str = Arrays.asList("gm","hi","bye","ge","hello","gn");
		
		Function<String, String> functionInterfaceGetIndex = String::toUpperCase;
	
		str.stream().map(String::toUpperCase).filter((s)->s.equalsIgnoreCase("ge")).forEach(System.out::println);
		
		//str.stream().map((s)->s.toUpperCase).filter((s)->s.equalsIgnoreCase("ge")).forEach(System.out::println);
		List<List<String> > s = new ArrayList();
		
		s.add(str);
		s.add(str);
		s.add(str);
		
		List<List<Employee> > e =new ArrayList();
		List<Employee> e1 = new ArrayList();
		List<Employee> e2 = Arrays.asList(new Employee("Ravi", 2, 20000.0, Department.HR));
		List<Employee> e3 = Arrays.asList(new Employee("Ramu", 2, 30000.0, Department.HR));
		List<Employee> e4 = Arrays.asList(new Employee("Raj", 2, 40000.0, Department.HR));
		
		e1.add(new Employee("Ram", 2, 10000.0, Department.HR));

		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
	
	System.out.println("-------printing Employee references using map----------");	
	List<Stream<String>> ee = e.stream().map(l->l.stream().map(i->i.getName().toUpperCase())).collect(Collectors.toList());
	ee.forEach(System.out::println);
	
	System.out.println("-------printing Employee using flatmap----------");	
	List<String> ee1 = e.stream().flatMap(l->l.stream().map(i->i.getName().toUpperCase())).collect(Collectors.toList());
	ee1.forEach(System.out::println);
	
	List<Stream<String>> w = s.stream().map(a->
		a.stream().map(String::toUpperCase)).collect(Collectors.toList());
	
	List<String> w1 = s.stream().flatMap(a->
	a.stream().map(String::toUpperCase)).collect(Collectors.toList());
	
	System.out.println("********************************************************");
	
	System.out.println("-------printing String references using map----------");	
	w.forEach(System.out::println);
	System.out.println("-------printing String using flatmap----------");	
	w1.forEach(System.out::println);
	
	
	Function<Employee, String > fp = Employee::getName;
	
	System.out.println("my method reference: "+ fp.apply(new Employee("Lalit", 25, 6200.0, Department.OPERATIONS))) ;
		 }
	}

 


	