import java.util.Scanner;

class Employee1 {
    private String name;
    private double monthlySalary;

    public Employee1(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            this.monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        double annualSalary = getAnnualSalary();
        return annualSalary * taxRate;
    }
}

public class Lab312 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String name = scanner.next();
            double salary = scanner.nextDouble();
            double taxRate = scanner.nextDouble();
            double raiseAmount = scanner.nextDouble();

            Employee1 emp = new Employee1(name, salary);

            System.out.println("Tax (Before): " + emp.calculateTax(taxRate));

            emp.giveRaise(raiseAmount);

            System.out.println("Tax (After): " + emp.calculateTax(taxRate));
        }
        
        scanner.close();
    }
}