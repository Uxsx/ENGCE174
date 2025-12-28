import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class lab512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String basicName = scanner.nextLine();
        double basicPrice = Double.parseDouble(scanner.nextLine());

        String premiumName = scanner.nextLine();
        double premiumPrice = Double.parseDouble(scanner.nextLine());
        double rate = Double.parseDouble(scanner.nextLine());
        Service s1 = new BasicService(basicName, basicPrice);
        Service s2 = new PremiumService(premiumName, premiumPrice, rate);

        Service[] services = {s1, s2};

        for (Service s : services) {
            System.out.println(s.calculateFinalPrice());
        }

        scanner.close();
    }
}