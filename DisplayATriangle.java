//Exercise 3: Display a triangle with height entered by users
import java.util.Scanner;
public class DisplayATriangle {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner scanner = new Scanner(System.in);

        //Enter the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        int height = scanner.nextInt();

        //Display the triangle
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}