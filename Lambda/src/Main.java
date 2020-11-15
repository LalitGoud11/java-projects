import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public final static Employee e = null;
	public static void main(String[] args) {
		
		// instantiating thread using anonymous class
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous class created");
			}
		};
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("ruuning from runnable");	
				System.out.println("---------------------------");
				}
		});
		
		Thread t1 = new Thread(r);
		
		// lambda expression doing same
		Thread thread1 = new Thread( ()-> {
			System.out.println("lambda -> ruuning code from runnable method");
		});
		thread1.start();
		thread. start();
		
		//---------------------------------------------------
		//sorting object using Collections.
		
		Employee tim = new Employee("tim");
		Employee achu = new Employee("achu");
		Employee charu = new Employee("charu");
		
		List<Employee> list = new ArrayList<>();
		list.add(tim);
		list.add(achu);
		list.add(charu);
		
		System.out.println("Printing from collections comparable interface.......");
		Collections.sort(list);	
		
		for(Employee e: list) {
			System.out.println(e);
		}
		
		
		System.out.println("");
		System.out.println("Runnig from anonymous class");	
		Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println("pring this regular method.......");
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("");
		
		
		//---------------------------------------------------
		//sorting using lambda
		list = new ArrayList<>();
		list.add(tim);
		list.add(achu);
		list.add(charu);
		list.add(new Employee("baru"));
		
		Collections.sort(list, (Employee o1, Employee o2) -> {
			return o1.name.compareTo(o2.name);
		});
		
		System.out.println("pring this lambda method.......");
		for(Employee e: list) {
			System.out.println(e);
		}
		System.out.println("");	
		
		
		//---------------------------------------------------
		//sorting using lambda method reference
		list = new ArrayList<>();
		list.add(tim);
		list.add(achu);
		list.add(charu);
		list.add(new Employee("zaru"));
		
		System.out.println("pring this lambda method under reference.......");
		Collections.sort(list, (Employee::compareTo));
		
		for(Employee e: list) {
			System.out.println(e);
		}
		
		
		Main.e.print("l");
		
		
		
	}
	
	

}
//class Employee implements Comparator<Employee>
class Employee  implements Comparable<Employee>
{
	String name;
	
	public Employee() {
		
	}
	
	public Employee(String name) {
		
	this.name = name;	
	}
	
	public void  print( String pi ) {
		System.out.println(pi);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}

//	@Override
//	public int compare(Employee o1, Employee o2) {
//		return o1.name.compareTo(o2.name);
//	}

	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
	}
	
	
}