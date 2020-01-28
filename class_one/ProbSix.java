import java.io.*; //.File and .FileNotFoundException
import java.util.Scanner;
import java.util.ArrayList;

public class ProbSix
{
    public static void main(String[] args) throws Exception
    {
        File file = new File("/Users/jacobpelletier/Desktop/CS152/class_one/studentdata.txt");
        Scanner scan = new Scanner(file);

        ArrayList<String> data = new ArrayList<String>(); // initialize student data ArrayList

        while (scan.hasNextLine())
            data.add(scan.nextLine());

        for (int index = 0; index < data.size(); index++) {
            Student newStudent = new Student(data.get(index));
            System.out.println(data.get(index));
        }
    }
}

class Student
{
    private String name, code, age, gpa, comments;
    //------------------------------------------------------------------------------------------------------------------
    // constructor for Student object.
    // expected input is a String of 4 comma seperated values.
    // output is a Student object
    //------------------------------------------------------------------------------------------------------------------
    public Student(String input) {
        String[] studentData = input.split(",");
        // Constructor for Student class
        for (int x = 0; x < studentData.length; x++) {
            switch (x) {
                case 0:
                    code = studentData[x];
                    break;
                case 1:
                    name = studentData[x];
                    break;
                case 2:
                    age = studentData[x];
                    break;
                case 3:
                    gpa = studentData[x];
                    break;
                default:
                    comments += studentData[x];
                    break;
            }
        }
    }
    //------------------------------------------------------------------------------------------------------------------
    // Getters
    //------------------------------------------------------------------------------------------------------------------
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public String getGPA() {
        return gpa;
    }
    public String getComments() {
        return comments;
    }
    public String toString()
    {
        String result;
        result = code + ", " + name + ", " + age + ", " + gpa + ", " + comments + ".";
        return result;
    }
    //------------------------------------------------------------------------------------------------------------------
    // Setters
    //------------------------------------------------------------------------------------------------------------------
    public void setCode(String newCode) { this.code = newCode; }
    public void setName(String newName) { this.name = newName; }
    public void setAge(String newAge) { this.age = newAge; }
    public void setGPA(String newGPA) { this.gpa = newGPA; }
    public void setComments(String newComments) { this.comments = newComments; }
}