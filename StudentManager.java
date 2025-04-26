import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayStudents() {
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
