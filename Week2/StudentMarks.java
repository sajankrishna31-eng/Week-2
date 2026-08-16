class Marks {
    int subject1;
    int subject2;
    int subject3;

    void calculate() {
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Subject 1 : " + subject1);
        System.out.println("Subject 2 : " + subject2);
        System.out.println("Subject 3 : " + subject3);
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);
    }
}

public class StudentMarks {
    public static void main(String[] args) {
        Marks m = new Marks();
        m.subject1 = 85;
        m.subject2 = 78;
        m.subject3 = 92;

        System.out.println("Marks Details:");
        m.calculate();
    }
}