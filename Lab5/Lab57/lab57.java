import java.util.Scanner;

class Employeee {
    protected String name;
    protected double baseSalary;

    public Employeee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employeee {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employeee {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employeee e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

// --- 5. Main Class ---
public class lab57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String sName = sc.nextLine();
        System.out.print("Enter Base Salary: ");
        double sSalary = sc.nextDouble();
        System.out.print("Enter Commission Rate (e.g., 0.10): ");
        double sRate = sc.nextDouble();
        sc.nextLine();

        SalesEmployee salesEmp = new SalesEmployee(sName, sSalary, sRate);

        System.out.print("Enter Name: ");
        String mName = sc.nextLine();
        System.out.print("Enter Base Salary: ");
        double mSalary = sc.nextDouble();
        System.out.print("Enter Fixed Bonus: ");
        double mBonus = sc.nextDouble();

        Manager manager = new Manager(mName, mSalary, mBonus);

        PayrollProcessor.process(salesEmp);
        PayrollProcessor.process(manager);

        sc.close();
    }
}