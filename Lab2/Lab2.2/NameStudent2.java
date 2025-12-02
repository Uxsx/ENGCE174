import java.util.Scanner ;

public class NameStudent2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        System.out.print("Input ID : ") ;
        String idIn = scan.nextLine() ;

        System.out.print("Input Name : ") ;
        String nameIn = scan.nextLine() ;

        Student2 std = new Student2(idIn, nameIn) ;

        std.displayInfo() ;
        
        scan.close() ; 
    }
}