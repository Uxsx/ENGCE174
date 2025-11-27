public class Student {
    String studentId;
    String name;

    public Student(String id, String n) {
        this.studentId = id;
        this.name = n;
    }

    public void displayInfo() {
       System.out.println(this.studentId);
       System.out.println(this.name);
    }
}