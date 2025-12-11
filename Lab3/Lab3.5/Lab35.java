import java.util.Scanner ;

class DatabaseConnection {
    private String connectionString ;
    private boolean connected ;

    public DatabaseConnection(String connectionString) {
        this.connectionString = connectionString ;
        this.connected = false ;
    }

    public boolean isConnected() {
        return this.connected ;
    }

    public void connect() {
        if (!this.connected) {
            this.connected = true ;
            System.out.println("Connect to " + this.connectionString) ;
        } else {
            System.out.println("Already connected") ;
        }
    }

    public void disconnected() {
        if (this.connected == true) {
            this.connected = false ;
            System.out.println("Disconnected") ;
        } else {
            System.out.println("Already disconnected") ;
        }
    }
}

public class Lab35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Input Database: ");
        String input = scanner.next() ;

        DatabaseConnection databaseConnection = new DatabaseConnection(input) ;

        databaseConnection.connect() ;
        databaseConnection.disconnected() ;
        databaseConnection.disconnected() ;

        System.out.print(databaseConnection.isConnected()) ;

        scanner.close() ;
    }
}
