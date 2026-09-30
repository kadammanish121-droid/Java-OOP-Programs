import java.util.Scanner;

class EmpL{
    int employeeId;
    String name;
    double salary;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();

        System.out.print("Enter Name: ");
        name = sc.next();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class E1 {
    
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        System.out.println("Enter details of Employee 1:");
        e1.accept();

        System.out.println("\nEnter details of Employee 2:");
        e2.accept();

        System.out.println("\nEmployee 1 Details:");
        e1.display();

        System.out.println("\nEmployee 2 Details:");
        e2.display();
    }
}