import java.util.Scanner ;

public class SumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOne = input.nextInt() ;
        int numTwo = input.nextInt() ;

        int sum = numOne + numTwo ;

        System.out.println(sum) ;

        input.close() ;
    }
}
