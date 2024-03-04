import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {

    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.employee_id = id;
        this.employee_name = name;
        this.employee_salary = salary;
    }

    // Getter and setter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int id) {
        this.employee_id = id;
    }

    // Getter and setter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String name) {
        this.employee_name = name;
    }

    // Getter for employee_salary (formatted string)
    public String getFormattedSalary() {
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
        return currencyFormatter.format(employee_salary);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee details
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(empId, empName, empSalary);

        // Display Employee information
        System.out.println("\nEmployee Information:");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Employee Salary: " + employee.getFormattedSalary());

        scanner.close();
    }
}

