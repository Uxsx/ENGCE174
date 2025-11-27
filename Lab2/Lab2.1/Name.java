import java.util.Scanner ;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        
        // รับ ID
        String idIn = scanner.nextLine() ;
        //  รับชื่อ
        String nameIn = scanner.nextLine() ;
        
        Student std = new Student(idIn, nameIn) ;

        std.displayInfo() ;
        
        scanner.close() ; 
    }
}