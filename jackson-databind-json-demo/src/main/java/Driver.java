import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {
		
		
		try {
		
			ObjectMapper mapper = new ObjectMapper();
			
			Student student  =mapper.readValue(new File("data/sample-lite.json"), Student.class);		
			
			System.out.println("Student name is = " + student.getFirstName());
			System.out.println("Student lastname = " + student.getLastName());
			
		}
		catch(Exception exe){
			exe.printStackTrace();
		}
		
	}
}
