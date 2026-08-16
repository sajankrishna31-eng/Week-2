class Employee {
    String name;
    int empId;
    double salary;

    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : ₹" + salary);
        System.out.println();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Ravi Verma";
        e1.empId = 1001;
        e1.salary = 45000;

        Employee e2 = new Employee();
        e2.name = "Anjali Mehta";
        e2.empId = 1002;
        e2.salary = 52000;

        System.out.println("Employee 1 Details:");
        e1.display();

        System.out.println("Employee 2 Details:");
        e2.display();
    }
}