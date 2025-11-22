import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("กรุณากรอกคะแนน : ");

        int score = scanner.nextInt(); 

        if (score > 100 || score < 0) {
            System.out.println("คะแนนไม่ถูกต้อง (ต้องอยู่ระหว่าง 0-100)") ;
        } else if (score >= 80) {
            System.out.println("A") ;
        } else if (score >= 70) {
            System.out.println("B") ;
        } else if (score >= 60) {
            System.out.println("C") ;
        } else if (score >= 50) {
            System.out.println("D") ;
        } else {
            System.out.println("F") ;
        }

        scanner.close() ;
    }
}