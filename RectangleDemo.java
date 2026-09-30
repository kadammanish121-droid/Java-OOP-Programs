import java.util.Scanner;

class Rectangle {
    double length, breadth;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        length = sc.nextDouble();

        System.out.print("Enter Breadth: ");
        breadth = sc.nextDouble();
    }

    void display() {
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        System.out.println("Enter details of Rectangle 1:");
        r1.accept();

        System.out.println("\nEnter details of Rectangle 2:");
        r2.accept();

        System.out.println("\nRectangle 1:");
        r1.display();

        System.out.println("\nRectangle 2:");
        r2.display();
    }
}