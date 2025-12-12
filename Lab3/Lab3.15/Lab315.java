import java.util.Scanner ;

class User3 {
    private String username ;
    
    private int failedAttempts ;
    
    private boolean isLocked ;
    

    private static int maxAttempts = 3 ;

    public User3(String username) {
        this.username = username ;
        this.failedAttempts = 0 ;
        this.isLocked = false ;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max ;
            System.out.println("Policy updated.") ;
        } else {
            System.out.println("Invalid policy.") ;
        }
    }

    public String getUsername() {
        return this.username ;
    }

    public boolean isLocked() {
        return this.isLocked ;
    }

    public int getFailedAttempts() {
        return this.failedAttempts ;
    }

    public void login(String password) {
        if (this.isLocked) {
            System.out.println("Account is locked.") ;
            return ;
        }

        if (password.equals("pass123")) {
            this.failedAttempts = 0;
            System.out.println("Login successful.") ;
        } else {
            this.failedAttempts++ ;

            if (this.failedAttempts >= maxAttempts) {
                this.isLocked = true ;
                System.out.println("Login failed. Account locked.") ;
            } else {
                int attemptsLeft = maxAttempts - this.failedAttempts ;
                System.out.println("Login failed. " + attemptsLeft + " attempts left.") ;
            }
        }
    }
}

public class Lab315 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        String username = scanner.next() ;
        User3 myUser = new User3(username) ;

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt() ;

            for (int i = 0; i < n; i++) {
                String cmd = scanner.next() ;

                switch (cmd) {
                    case "SET_POLICY":
                        int newMax = scanner.nextInt() ;
                        User3.setPolicy(newMax) ; 
                        break ;

                    case "LOGIN":
                        String password = scanner.next() ;
                        myUser.login(password) ; 
                        break ;
                }
            }
        }
        scanner.close() ;
    }
}