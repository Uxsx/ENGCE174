package Lab41;
import java.util.Scanner;

class Book {
    private String title;
    private String author;



    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title,String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title + "," + "Author: " + this.author);
    }
}

public class lab41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Mode 1 or 2: ");
        int mode = scanner.nextInt();

        if(mode == 1) {
            scanner.nextLine();
            String getN = scanner.nextLine();
            Book book = new Book(getN);
            book.displayInfo();
        } else if(mode == 2) {
            scanner.nextLine();
            String getN = scanner.nextLine();
            String getA = scanner.nextLine();
            Book book = new Book(getN, getA); 
            book.displayInfo();
        } else {
            System.out.println("Error pls Select Mode 1 or 2");
        }

        scanner.close();
    }
}
