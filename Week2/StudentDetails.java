class Student {
    String name;
    int rollNo;
    String department;
}

public class StudentDetails {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul Sharma";
        s.rollNo = 101;
        s.department = "Computer Science";

        System.out.println("Student Details:");
        System.out.println("Name       : " + s.name);
        System.out.println("Roll No    : " + s.rollNo);
        System.out.println("Department : " + s.department);
    }
}