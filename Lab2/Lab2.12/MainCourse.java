import java.util.Scanner ;

public class MainCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Input course ID: ") ;
        String cosId = scanner.nextLine() ;
        System.out.print("Input course Name: ") ;
        String cosName = scanner.nextLine() ;
        System.out.print("Input Name: ") ;
        String na = scanner.nextLine() ;

        Course course = new Course(cosId, cosName) ;
        StudentCourse studentCourse = new StudentCourse(na, course) ;

        scanner.close() ;

        studentCourse.displayEnrollment() ;
    }
}
