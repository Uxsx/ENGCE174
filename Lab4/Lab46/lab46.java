package Lab46;
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY); 
    }

    public void displayInfo() {
        System.out.println("( " + this.x + "," + this.y + " )");
    }

}

public class lab46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        int four = scanner.nextInt();

        Point po1 = new Point(one, two);
        Point po2 = po1.move(three, four);
        Point po3 = po2.move(three, four);

        po1.displayInfo();
        po2.displayInfo();
        po3.displayInfo();
        
        scanner.close();
    }
}
