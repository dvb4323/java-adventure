//Example 5: Calculate sum, difference, product, and
// quotient of 2 double numbers which are entered by users
import java.util.Scanner;
import java.lang.Math;
public class CalculateTwoNumbers {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner s = new Scanner(System.in);

        //Input the first number
        System.out.println("Please enter the first number: ");
        double firstNumber = s.nextDouble();

        //Input the second number
        System.out.println("Please enter the second number: ");
        double secondNumber = s.nextDouble();

        //Calculate and display the sum of two numbers
        double sum = firstNumber + secondNumber;
        System.out.println("The sum of 2 numbers is: " + sum);

        //Calculate and display the difference of two numbers
        double diff = Math.abs(firstNumber - secondNumber);
        System.out.println("The difference of two numbers is: " + diff);

        //Calculate and display the product of two numbers
        double product = firstNumber * secondNumber;
        System.out.println("The product of two numbers is: " + product);

        //Calculate and display the quotient of two numbers
        if (secondNumber != 0) {
            double quotient = firstNumber / secondNumber;
            System.out.println("The quotient of two numbers is: " + quotient);
        } else {
            System.out.println("The divisor is 0!");
        }
    }
}
