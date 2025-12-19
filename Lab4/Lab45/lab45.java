package Lab45;
import java.util.Scanner;

class Color {
    private final int red;
    private final int green;
    private final int blue;

    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }

    private int validate(int value) {
        if (value < 0) return 0;
        if (value > 255) return 255;
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("R=" + red + ", G=" + green + ", B=" + blue);
    }
}

public class lab45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r = scanner.nextInt();
        int g = scanner.nextInt();
        int b = scanner.nextInt();

        Color myColor = new Color(r, g, b);

        myColor.displayRGB();
        
        scanner.close();
    }
}
