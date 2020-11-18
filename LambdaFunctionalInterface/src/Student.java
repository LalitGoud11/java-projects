
public class Student
{
    private String name;
    private int marks;
    
    public Student(final String name, final int marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(final String name) {
        this.name = name;
    }
    
    public int getMarks() {
        return this.marks;
    }
    
    public void setMarks(final int marks) {
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return "Student [name=" + this.name + ", marks=" + this.marks + "]";
    }
}