public class Student2 {
    private String studentId;
    private String name;
    
    public Student2(String id, String n) {
        this.studentId = id;
        this.name = n;
    }
    
    public String getStudentId() { 
        return studentId;
    }
    
    public String getName() {
        return name;
    }

    public void displayInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + name);
    }
}