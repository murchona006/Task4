package murchona;
import java.util.Scanner;
public class Main {



    public static void main(String[] args)
    {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int x = scan.nextInt();


    AdvancedArithmetic myCalculator = new MyCalculator();
    int sum = myCalculator.divisorSum(n);
        System.out.println("Sum of divisors : " + myCalculator.divisorSum(n) );

        int fact = myCalculator.findFactorial(n);
        System.out.println("factorial of n is: "+myCalculator.findFactorial(x));


}
    }



