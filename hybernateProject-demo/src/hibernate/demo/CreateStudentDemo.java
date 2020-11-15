package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.EntityClass.Student;
import hibernate.EntityClass.StudentRecords;

public class CreateStudentDemo {

	public static void main(String[] args) {
	SessionFactory sf= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).
									addAnnotatedClass(StudentRecords.class).buildSessionFactory();

	Session session =sf.getCurrentSession();	
	
	
	try{
		
		session.beginTransaction();
		
		Student s = session.get(Student.class, 7);
		
		System.out.println(s);
		
		System.out.println(s.getStudentrecords());
		
		session.getTransaction().commit();
		
	
		
	} 
	finally {
		session.close();
		sf.close();
	}
	

}
}

