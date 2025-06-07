
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    static int employeeCount = 0;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        employeeCount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name +
                ", Dept: " + department + ", Salary: $" + salary);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 100;
        Employee[] employees = new Employee[n];

        System.out.println("Enter details of " + n + " employees:");

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            employees[i] = new Employee(id, name, department, salary);
        }

        System.out.println("\n=== Employee List ===");
        for (Employee emp : employees) {
            emp.display();
        }

        System.out.println("Total Employees: " + Employee.employeeCount);
        sc.close();
    }
}
