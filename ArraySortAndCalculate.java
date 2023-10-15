//Exercise 4: A program to sort a numeric array, and
// calculate the sum and average value of array elements
import java.util.Arrays;
public class ArraySortAndCalculate {
    public static void main(String[] args) {
        //Create a constant array
        int[] numbers = {12, 3, 42, 90, 0, 23, 248};

        //Create a variable to store the sum
        int sum = 0;

        // Sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Calculate the sum of the array elements
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum of array elements is : " + sum);

        // Calculate the average value of the array elements
        double average = (double) sum / numbers.length;
        System.out.println("The average value of array elements is: " + average);
    }
}

