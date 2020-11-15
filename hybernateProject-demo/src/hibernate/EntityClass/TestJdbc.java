package hibernate.EntityClass;


import java.sql.Connection;
import java.sql.DriverManager;

//used this only for testing code
public class TestJdbc {

	public static void main(String[] args) {
		
		
		
		String JdbcUrl =
				"jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false&serverTimezone=UTC";
		String UserN ="palsam-hybernate-project";
		String password ="password";
		
		
		try {
			System.out.println("Trying to connect to db");
			Connection con =DriverManager.getConnection(JdbcUrl, UserN, password);
			System.out.println("connected to db!!!!!");
			
		}
		catch(Exception exe) {
			
			exe.printStackTrace();
		}

	}

}
