import java.util.Comparator;

class MyEnumComparator implements Comparator<Department>
{
    public int compare(Department o1, Department o2)
    {
        return o1.name().compareTo(o2.name()); 
        
    }
}