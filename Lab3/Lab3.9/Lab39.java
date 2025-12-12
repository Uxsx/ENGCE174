import java.util.Scanner;

class User {
    private String username;
    private String password;
    private static int minPasswordLength = 8;

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length");
        } else {
            minPasswordLength = length;
            System.out.println("New min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPasswordLength;
    }

    public User(String username, String password) {
        this.username = username;
        if (password.length() >= minPasswordLength) {
            this.password = password;
            this.username = username;
            System.out.println("Creation successful");
        } else {
            this.password = "invalid";
            this.username = username;
            System.out.println("Creation failed");
        }
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPasswordLength) {
            this.password = newPassword;
            System.out.println("Update successful");
        } else {
            System.out.println("Update failed");
        }
    }

    public String getPassword() {
        return this.password;
    }
}

public class Lab39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minLength1 = scanner.nextInt();
        scanner.nextLine();
        
        User.setMinLength(minLength1);

        String u1_name = scanner.nextLine();
        String u1_pass = scanner.nextLine();
        
        User user1 = new User(u1_name, u1_pass);

        String u2_name = scanner.nextLine();
        String u2_pass = scanner.nextLine();
        
        User user2 = new User(u2_name, u2_pass);

        int minLeng2 = scanner.nextInt();
        scanner.nextLine();

        User.setMinLength(minLeng2);

        String user2_newPass = scanner.nextLine();
        
        user2.setPassword(user2_newPass);

        System.out.println(user1.getPassword());
        System.out.println(user2.getPassword());

        scanner.close();
    }
}