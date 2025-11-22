import java.util.Scanner ;

public class SumNumber {

    public static int calculateSum(int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int firstNumber = 0 ;
        int secondNumber = 0 ;

        try {
            if (input.hasNextInt()) {
                firstNumber = input.nextInt() ;
            } else {
                System.out.println("Error: Please enter a valid integer for the first number.") ;
                return ; 
            }

            if (input.hasNextInt()) {
                secondNumber = input.nextInt() ;
            } else {
                System.out.println("Error: Please enter a valid integer for the second number.") ;
                return ;
            }

            int totalSum = calculateSum(firstNumber, secondNumber) ;

            System.out.println(totalSum) ;

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.") ;
        } finally {
            input.close() ;
        }
    }
}