import java.util.Scanner ;

class user {
    private String username ;

    public user (String username){
        this.username = username ;
    }

    public String getUsername() {
        return this.username ;
    }
    
}

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        String inname = scanner.nextLine() ;

        user user = new user(inname) ;

        System.out.print(user.getUsername());

        scanner.close();
    }
}
