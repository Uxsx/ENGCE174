import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;

        System.out.print("Name: ") ;
        String na = scan.nextLine() ;
        System.out.print("Street: ") ;
        String st = scan.nextLine() ;
        System.out.print("City: ") ;
        String ct = scan.nextLine() ;
        System.out.print("ZipCode: ") ;
        String zc = scan.nextLine() ;

        Address address = new Address(st, ct, zc) ;
        Student student = new Student(na, address) ;

        scan.close() ;

        student.displayProfile() ;
    }
}
