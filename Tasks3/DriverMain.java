import java.util.Scanner;

//Taxable
interface Taxable {
    double salesTax = 0.07;
    double incomeTax = 0.105;

    void calcTax(); // abstract method
}

// Employee
class Employee implements Taxable {
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Implements income tax calculations
    public void calcTax() {
        double tax = salary * 12 * incomeTax; // Yearly salary (PA)
        System.out.println("Income Tax for Employee " + name + ": Rs. " + tax);
    }
}

// Product
class Product implements Taxable {
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    // Implements Sales Tax Calculation
    public void calcTax() {
        double tax = price * salesTax;
        System.out.println("Sales Tax for product ID " + pid + ": Rs. " + tax);
    }
}

// Driver Main
public class DriverMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee Input
        System.out.println("Enter Employee ID, name, & Monthly Salary: ");
        int empId = sc.nextInt();
        sc.nextLine(); // For new line
        String name = sc.nextLine();
        double salary = sc.nextDouble();
        Employee emp = new Employee(empId, name, salary);
        emp.calcTax();

        // Product Input
        System.out.println("Enter Product ID, Price, Quantity: ");
        int pid = sc.nextInt();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        Product prod = new Product(pid, price, quantity);
        prod.calcTax();
    }
}