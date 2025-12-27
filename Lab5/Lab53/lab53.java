import java.util.Scanner;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        
        double extraBonus = salary * 0.05;
        
        return baseBonus + extraBonus;
    }
}

public class lab53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ");
        double inputSalary = sc.nextDouble();

        Manager mgr = new Manager();

        mgr.salary = inputSalary;

        double totalBonus = mgr.calculateBonus();
        System.out.println("Manager Total Bonus: " + totalBonus);

        sc.close();
    }
}    
