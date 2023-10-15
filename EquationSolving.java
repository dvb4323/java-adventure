//Example 6: A program that solves a first-degree equation with one variable,
//a system of first-degree equation with two variables
//or a second-degree equation with one variable
import java.util.Scanner;
public class EquationSolving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Solve a linear equation with one variable");
            System.out.println("2. Solve a system of first-degree equations with two variables");
            System.out.println("3. Solve a second-degree equation with one variable");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            // Read user input
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Perform action based on choice
            switch (choice) {
                case 1:
                    solveLinearEquation(scanner);
                    break;
                case 2:
                    solveSystemOfEquations(scanner);
                    break;
                case 3:
                    solveSecondDegreeEquation(scanner);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            System.out.println(); // Print a new line for clarity
        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }

    //Solve the linear equation
    public static void solveLinearEquation(Scanner scanner) {
        System.out.println("Solving a linear equation with one variable.");
        System.out.println("Format of the equation: ax + b = 0");

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = -b / a;
            System.out.println("Solution: x = " + x);
        }

        scanner.nextLine(); // Consume the newline character
    }

    //Solve the system of equations
    public static void solveSystemOfEquations(Scanner scanner) {
        System.out.println("Solving a system of first-degree equations with 2 variables.");
        System.out.println("Format of the equations: ax + by = c and dx + ey = f");

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        System.out.print("Enter the value of d: ");
        double d = scanner.nextDouble();

        System.out.print("Enter the value of e: ");
        double e = scanner.nextDouble();

        System.out.print("Enter the value of f: ");
        double f = scanner.nextDouble();

        double determinant = a * e - b * d;

        if (determinant == 0) {
            if (c == f) {
                System.out.println("Infinite solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            double x = (e * c - b * f) / determinant;
            double y = (a * f - d * c) / determinant;
            System.out.println("Solution: x = " + x + ", y = " + y);
        }

        scanner.nextLine(); // Consume the newline character
    }

    //Solve the second-degree equation
    public static void solveSecondDegreeEquation(Scanner scanner) {
        System.out.println("Solving a second-degree equation with one variable.");
        System.out.println("Format of the equation: ax^2 + bx + c = 0");

        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        //Handle the case with a = 0
        if (a == 0) {
            // Handle the case as a first-degree equation
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Infinite solutions.");
                } else {
                    System.out.println("No solution.");
                }
            } else {
                double x = -c / b;
                System.out.println("Solution: x = " + x);
            }
        } else {
            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println("Two distinct real roots: " + root1 + " and " + root2);
            } else if (discriminant == 0) {
                double root = -b / (2 * a);
                System.out.println("One real root: " + root);
            } else {
                System.out.println("No real roots. Roots are complex numbers.");
            }
        }

        scanner.nextLine(); // Consume the newline character
    }
}
