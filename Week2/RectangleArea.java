class Rectangle {
    double length;
    double breadth;

    void calculateArea() {
        double area = length * breadth;
        System.out.println("Length  : " + length);
        System.out.println("Breadth : " + breadth);
        System.out.println("Area    : " + area);
    }
}

public class RectangleArea {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 12.5;
        r.breadth = 8.0;

        System.out.println("Rectangle Details:");
        r.calculateArea();
    }
}