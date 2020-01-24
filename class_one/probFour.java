public class probFour
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

        Student[] ca152 = new Student[28];
        for (int i = 0; i <=2; i++)
        {
            switch (i)
            {
                case 0:
                    ca152[i] = john;
                    break;
                case 1:
                    ca152[i] = anna;
                    break;
                case 2:
                    ca152[i] = sue;
                    break;
                default:
                    break;
            }
            System.out.println("Value: " + ca152[i] + "\tIndex: " + i);
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
