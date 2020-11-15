package leetCode;

public class Main {
	
	public static <R> R print( R print ){
		return print;
	}
	
	public static void main(String[] args){
		
		System.out.println(print(10));
		System.out.println(print("101"));
		System.out.println(print("1001"));
		System.out.println(print("10101"));
	}

  
    
}
