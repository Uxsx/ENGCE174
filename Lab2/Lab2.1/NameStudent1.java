import java.util.Scanner ;

public class NameStudent1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        
        System.out.print("Input ID : ") ;
        String idIn = scan.nextLine() ;

        System.out.print("Input Name : ") ;
        String nameIn = scan.nextLine() ;

        Student1 std = new Student1(idIn, nameIn) ;

        System.out.println(std.getStudentId());
        System.out.println(std.getName());
        
        scan.close() ; 
    }
}