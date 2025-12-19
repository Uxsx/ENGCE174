package Lab43;
import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        username = "Guest";
        level = 1;
    }

    public Player(String username,int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + this.username + ", " + "Level: " + this.level);
    }
}

public class Lab43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select Mode 1 or 2: ");
        int mode = scanner.nextInt();
        scanner.nextLine();

        if(mode == 1) {
            Player player = new Player();
            player.displayProfile();
        } else if(mode == 2) {
            String getName = scanner.nextLine();
            int getLevel = scanner.nextInt();
            Player player = new Player(getName, getLevel);
            player.displayProfile();
        } else {
            System.out.println("error");
        }
    }
}
