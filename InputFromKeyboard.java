//Exercise 2: A program for input/output from keyboard
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args){
        //Create a scanner object
        Scanner keyboard = new Scanner(System.in);

        //Input the name
        System.out.println("What's your name?");
        String strName = keyboard.nextLine();

        //Input the age
        System.out.println("How old are you?");
        int iAge = keyboard.nextInt();

        //Input the height
        System.out.println("How tall are you (m)?");
        double dHeight = keyboard.nextDouble();

        //similar to other data types
        //nextByte(), next Short(), nextLong()
        //nextFloat(), nextBoolean()

        //Print out the result
        System.out.println("Mrs/Mr. " + strName + ", " + iAge + " years old. "
                + "Your height is " + dHeight + ".");
    }
}