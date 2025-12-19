package Lab44;
import java.util.Scanner;

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Location other) {
        this.latitude = other.latitude;
        this.longitude = other.longitude;
    }

    public void setLatitude(double newLat) {
        this.latitude = newLat;
    }

    public void displayInfo() {
        System.out.println("Lat:" + this.latitude + ", " + "Long: " + this.longitude);
    }
}

public class Lab44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double getOne = scanner.nextDouble();
        double getTwo = scanner.nextDouble();
        double getThree = scanner.nextDouble();

        Location loc1 = new Location(getOne, getTwo);
        Location loc2 = new Location(loc1);

        loc2.setLatitude(getThree);

        loc2.displayInfo();
        loc1.displayInfo();

        scanner.close();
    }
}
