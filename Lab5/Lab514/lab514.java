import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String id, double baseFee) {
        this.trackingId = id;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() { return baseFee; }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) { super(id, baseFee); }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee; 
    }
}

public class lab514 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Standard (id fee): ");
        StandardShipping s1 = new StandardShipping(sc.next(), sc.nextDouble());

        System.out.print("Enter Premium (id fee insurance): ");
        PremiumShipping p1 = new PremiumShipping(sc.next(), sc.nextDouble(), sc.nextDouble());

        Shipping[] shipList = {s1, p1};

        for (Shipping s : shipList) {
            System.out.println("ID: " + s.trackingId + " | Total Fee: " + s.calculateTotalFee());
        }
    }
}