import java.util.Scanner ;

public class NameStudent3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in) ;
        System.out.print("Student ") ;
        int n = scan.nextInt() ;
        scan.nextLine() ;

        for (int i = 0; i < n; i++) {   

            System.out.print("INPUT ID : ") ;
            String id = scan.nextLine() ;

            System.out.print("INPUT NAME : ") ;
            String na = scan.nextLine() ;
            
            Student3 std3 = new Student3(id, na) ;
        }

        System.out.println("Count Student " + Student3.getCount());

        scan.close();
    }
}
