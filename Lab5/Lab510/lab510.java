import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String desc, int hours) {
        this.description = desc;
        this.baseHours = hours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String desc, int hours, double fee) {
        super(desc, hours);
        this.setupFee = fee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {
    public SimpleTask(String desc, int hours) {
        super(desc, hours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class lab510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cDesc = sc.nextLine();
        int cHours = sc.nextInt();
        double cFee = sc.nextDouble();
        sc.nextLine();

        String sDesc = sc.nextLine();
        int sHours = sc.nextInt();

        ComplexTask complex = new ComplexTask(cDesc, cHours, cFee);
        SimpleTask simple = new SimpleTask(sDesc, sHours);

        ProjectTask[] tasks = { complex, simple };

        for (ProjectTask task : tasks) {
            System.out.println("Task: " + task.description + ", Cost: " + task.calculateCost());
        }

        sc.close();
    }
}