public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        Student s1 = new Student("Alice", 101, 88.5);
        Student s2 = new Student("Bob", 102, 92.0);
        Student s3 = new Student("Charlie", 103, 76.3);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        manager.displayStudents();
    }
}
