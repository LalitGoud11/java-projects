
import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;



public class Main
{
    public static void main(final String[] args) {
        final List<Integer> listNum = new ArrayList<Integer>();
        for (int i = 1; i < 11; ++i) {
            listNum.add(i);
        }
        System.out.println("List o fnumbers in an array = " + listNum.toString());
        System.out.println("******************************************************************************************");
        predicateMethod(listNum, "All no's greater than 3", x -> x > 3);
        System.out.println("******************************************************************************************");
        final Predicate<Integer> predicate = x -> x % 2 == 0;
        predicateMethod(listNum, "even numbers", predicate);
        System.out.println("******************************************************************************************");
        predicateMethod(listNum, "odd numbers", x -> x % 2 != 0);
        System.out.println("============================================================================================");
        System.out.println("Get marks of student greater than 95");
        System.out.println("============================================================================================");
        final Student ram = new Student("ram", 96);
        final Student ravi = new Student("ravi", 94);
        final Student raju = new Student("raju", 85);
        final Student ramu = new Student("ramu", 99);
        final List<Student> studentList = new ArrayList<Student>();
        studentList.add(ram);
        studentList.add(ramu);
        studentList.add(ravi);
        studentList.add(raju);
        predicateStudent(studentList, x -> x.getMarks() > 95);
        predicateStudent(studentList, new Predicate<Student>() {
            @Override
            public boolean test(final Student student) {
                return student.getMarks() < 90;
            }
        });
        final Supplier<Integer> suplier = () -> 10;
        System.out.println("Supplier result  " + suplier.get());
        final Function<Student, String> functionInterfaceGetName = (Function<Student, String>)(student -> student.getName());
        final Function<Student, Integer> functionInterfaceGetMarks = (Function<Student, Integer>)(student -> student.getMarks());
        System.out.println("----------------->" + functionInterfaceGetMarks.apply(studentList.get(0)));
        System.out.println("Marks: " + getStudentInfo(functionInterfaceGetMarks, studentList.get(0)) + ",Name: ");
        System.out.println(getStudentInfo(functionInterfaceGetName, studentList.get(0)));
        final BiFunction<String, Integer, String> bifun = (BiFunction<String, Integer, String>)((string, integer) -> String.valueOf(string) + " age is, " + integer);
        final String biFunOutput = bifun.apply("Lalit", 25);
        System.out.println(biFunOutput);
    }
    
    private static <R> R getStudentInfo(final Function<Student, R> getInfo, final Student stu) {
        return getInfo.apply(stu);
    }
    
    private static void predicateStudent(final List<Student> list, final Predicate<Student> predicate) {
        for (int i = 0; i < list.size(); ++i) {
            if (predicate.test(list.get(i))) {
                System.out.println(String.valueOf(list.get(i).getName().toUpperCase()) + " scored more than 95 marks.");
            }
        }
    }
    
    private static void predicateMethod(final List<Integer> listNum, final String condition, final Predicate<Integer> pred) {
        final List<Integer> listNewNums = new ArrayList<Integer>();
        for (final Integer i : listNum) {
            if (pred.test(i)) {
                listNewNums.add(i);
            }
        }
        System.out.println("Printing " + condition + " from given list using predicate = " + listNewNums.toString());
    }
}