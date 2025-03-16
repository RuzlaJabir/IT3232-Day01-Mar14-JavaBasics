import java.util.ArrayList;

class Student{

    String name;
    int marks;

    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

public class Q06_StudentsList{
    public static void main(String args[]){

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Ruzla",95));
        students.add(new Student("Shafna",90));
        students.add(new Student("Rifdha",85));
        students.add(new Student("Sara",80));
        students.add(new Student("Hana",75));

        int totalMarks = 0;
        for(Student s : students){
            totalMarks = totalMarks + s.marks;
        }

        System.out.println("Average marks: " + (totalMarks/students.size()));
    }
}