//Write a function to print the sum of all odd numbers from 1 to n.
import java.util.*;
public class sumOfAllOddNum {

    public static void printOddSum(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i; // Add the odd number to the sum
            }
        }
        
        System.out.println("Sum of all odd numbers from 1 to " + n + " is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a value for n: ");
        int n = sc.nextInt();
        
        // Call the function with user input
        printOddSum(n);
        
        sc.close();
    }
}