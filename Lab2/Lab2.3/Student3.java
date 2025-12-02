public class Student3 {
    private String studentId;
    private String name;

    private static int studentCount = 0 ;
    
    public Student3(String id, String n) {
        this.studentId = id ;
        this.name = n ;

        studentCount++ ;
    }
    
    public String getStudentId() { 
        return studentId ;
    }
    
    public String getName() {
        return name ;
    }

    public static int getCount() {
        return studentCount ;
    }
}
