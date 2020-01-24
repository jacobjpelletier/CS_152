import java.util.ArrayList;

public class probFourV2
{
    //------------------------------------------------------------------------------------------------------------------
    // Declare an array of Student the elements named ca152 and assign first three students:
    // “S101”, “John”, 25, 3.2
    // “S105”, “Anna”, 22, 3.9
    // “S107”, “Sue”, 29, 2.8
    // Print it.
    //------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args)
    {
        Student john = new Student("S101", "John", 25, 3.2);
        Student anna = new Student("S105", "Anna", 22, 3.9);
        Student sue = new Student("S107", "Sue", 29, 2.8);

        ArrayList<Student> ca152 = new ArrayList<Student>();
        ca152.add(john);
        ca152.add(anna);
        ca152.add(sue);

        int index = 0;
        while (index < ca152.size()) {
            System.out.println(ca152.get(index));
            index ++;
        }
    }
}

class Student
{
    private String name, code;
    private int age;
    private double gpa;

    public Student(String xcode, String xname, int xage, double xgpa)
    // Constructor for Student class
    {
        name = xname;
        code = xcode;
        age = xage;
        gpa = xgpa;
    }

    public String toString()
    {
        String result;
        result = code + ", " + name + ", " + age + ", " + gpa + ".";
        return result;
    }
}
