import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;


public class GroupingWithCollectors {
	
	  static List<Employee> employeeList = Arrays.asList(
	      new Employee("Tom Jones", 45, 12000.00,Department.MARKETING),
	      new Employee("Harry Major", 26, 20000.00, Department.LEGAL),
	      new Employee("Ethan Hardy", 65, 30000.00, Department.LEGAL),
	      new Employee("Nancy Smith", 22, 15000.00, Department.MARKETING),
	      new Employee("Catherine Jones", 21, 18000.00, Department.HR),
	      new Employee("James Elliot", 58, 24000.00, Department.OPERATIONS),
	      new Employee("Frank Anthony", 55, 32000.00, Department.MARKETING),
	      new Employee("Michael Reeves", 40, 45000.00, Department.OPERATIONS));
	  
	  public static void main(String args[]){
		  //type1
		  //By def values added to list
		  Map<Department, List<Employee>> employeeMap1
		    = employeeList.stream()
		      .collect(Collectors.groupingBy(Employee::getDepartment));
		  
		  System.out.println("Employees grouped by department");
		  employeeMap1.forEach(( key, str) -> System.out.println(key +" -> "+str)); 
		  
		  System.out.println("--------------------------------------------------");
		  
		  //type2
		  //Here overing the type to custom type set
		  Map<Department, Set<Employee>> employeeMap2
		    = employeeList.stream()
		      .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
		  
		  System.out.println("Employees grouped by department");
		  employeeMap2.forEach(( key, str) -> System.out.println(key +" -> "+str)); 
		  
		  System.out.println("--------------------------------------------------");

		 //type3 
		 //changing the result type of map to custom type map: treeMap
		 //i.e eg: TreeMap<Department, Set<Employee>> employeeMap
		Map<Department, Set<Employee>> employeeMap
		    = employeeList.stream()
		      .collect(Collectors.groupingBy(Employee::getDepartment, //Passing treeMap as 2nd Parm
		    		  											      //I made little complex by passing "MyEnumComparator()" because tree map was sorting based on object but i have compared it  with enum.name   
		    		  ()->new TreeMap<Department, Set<Employee>>(new MyEnumComparator()),
		    		  Collectors.toSet()));
		  
		  System.out.println("Employees grouped by department");
		  employeeMap.forEach(( key, str) -> System.out.println(key +" -> "+str));
		  
		  
		  }
}


	
	
