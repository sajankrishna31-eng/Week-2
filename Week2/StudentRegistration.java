class Student {
    String name;
    int rollNo;

    void display() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
    }
}

public class StudentRegistration {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Priya Patel";
        s.rollNo = 205;

        System.out.println("Student Details:");
        s.display();
    }
}