import java.util.Scanner ;

class Employee {
    private String employeeId ;
    private String department ;

    public Employee(String employeeId, String department) {
        this.employeeId = employeeId ;
        this.department = department ;
    }

    public String getEmployeedId() {
        return this.employeeId ;
    }

    public String getDepartment() {
        return this.department ;
    }

    public void setDepartment(String newDepartment) {
        this.department = newDepartment ;
    }
}


public class Lab37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;

        System.out.print("Input Id: ") ;
        String Idin = scanner.nextLine() ;
        System.out.print("Input First Department: ") ;
        String oneIn = scanner.nextLine() ;
        System.out.print("Input Second Department: ") ;
        String twoIn = scanner.nextLine() ;

        Employee employee = new Employee(Idin, oneIn) ;
        employee.setDepartment(twoIn) ;

        System.out.println(employee.getEmployeedId()) ;
        System.out.println(employee.getDepartment()) ;

        scanner.close() ;
    }
}
