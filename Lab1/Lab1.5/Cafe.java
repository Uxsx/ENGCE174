import java.util.Scanner ;

public class Cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        int menu = scanner.nextInt() ; 

        switch (menu) {
            case 1:
                System.out.println("Americano") ;
                break;
            case 2:
                System.out.println("Latte") ;
                break;
            case 3:
                System.out.println("Espresso") ;
                break;
            case 4:
                System.out.println("Mocha") ;
                break;
            default:
                System.out.println("Invalid Menu") ;
        }

        scanner.close() ;
    }
    
}