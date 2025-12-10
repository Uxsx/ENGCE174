public class StudentCourse {
    private String studentName ;
    private Course course ;

    public StudentCourse(String studentName, Course course){
        this.studentName = studentName ;
        this.course = course ;
    }

    public void displayEnrollment(){
        System.out.println("Student: " + this.studentName) ;
        String fullCourse = this.course.getCourseInfo() ;
        System.out.println("Enrolled in: " + fullCourse);
    }
}
