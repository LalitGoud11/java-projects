package hibernate.EntityClass;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student_Recods")
public class StudentRecords {

	@Id
	@Column(name = "student_rollno")
	private int studentRollno;

	@Column(name = "education_level")
	private String educationLevel;

	@Column(name = "course")
	private String course;

	@OneToOne(mappedBy = "studentrecords", cascade = CascadeType.ALL)
	private Student student;

	public StudentRecords() {

	}

	public StudentRecords(int studentRollno, String educationLevel, String course) {
		this.studentRollno = studentRollno;
		this.educationLevel = educationLevel;
		this.course = course;
	}

	public int getStudentRollno() {
		return studentRollno;
	}

	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	public String getEducationLevel() {
		return educationLevel;
	}

	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	// @Override
	// public String toString() {
	// return "StudentRecords [studentRollno=" + studentRollno + ", educationLevel="
	// + educationLevel + ", course="
	// + course + "]";
	// }

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "StudentRecords [studentRollno=" + studentRollno + ", educationLevel=" + educationLevel + ", course="
				+ course + "]";
	}

}
