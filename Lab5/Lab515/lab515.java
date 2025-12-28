import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Carr extends RentalVehicle {
    public Carr(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class lab515 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String carModel = scanner.nextLine();
        double carRate = scanner.nextDouble();
        scanner.nextLine();

        String motoModel = scanner.nextLine();
        double motoRate = scanner.nextDouble();

        Carr myCar = new Carr(carModel, carRate);
        Motorcycle myMoto = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = {myCar, myMoto};

        double totalRentalFee = 0;
        for (RentalVehicle v : vehicles) {
            totalRentalFee += v.calculateFee();
        }

        System.out.println(totalRentalFee);
        
        scanner.close();
    }
}