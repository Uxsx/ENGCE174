import java.util.Scanner ;

class User {
    private String password ;
    
    public User(String password) {
        this.password = password ;
    }

    public String getPassword() { return this.password ; }

    public void setPassword(String newPassword) {
        int length = newPassword.length() ;

        if (length >= 8) {
            System.out.println("Password updated.") ;
            this.password = newPassword ;
        } 
        else {
            System.out.println("Password is too short.") ;
        }
    }

}

public class Lab33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Password: ") ;
        String fin = scanner.nextLine() ;
        System.out.print("New Password: ") ;
        String tin = scanner.nextLine() ;

        User user = new User(fin) ;
        user.setPassword(tin) ;

        System.out.print(user.getPassword()) ;

        scanner.close() ;
    }
}
