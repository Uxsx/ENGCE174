package Lab48;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;

        if(rating < 0.0) {
            this.rating = 0.0;
        } else if (rating > 10.0) {
            this.rating = 10.0;
        } else {
            this.rating = rating;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title + ", Director: " + this.director + ", Rating: " + rating);
    }

}

public class lab48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        if(mode == 1) {
            String getTi = scanner.nextLine();
            Movie movie = new Movie(getTi);
            movie.displayDetails();
        } else if(mode == 2) {
            String getTi = scanner.nextLine();
            String movNa = scanner.nextLine();
            Movie movie = new Movie(getTi, movNa);
            movie.displayDetails();
        } else if (mode == 3) {
            String getTi = scanner.nextLine();
            String movNa = scanner.nextLine();
            double getRa = scanner.nextDouble();
            Movie movie = new Movie(getTi, movNa, getRa);
            movie.displayDetails();
        } else {
            System.out.println("input mode 1 2 or 3 only");
        }

        scanner.close();
    }
}
