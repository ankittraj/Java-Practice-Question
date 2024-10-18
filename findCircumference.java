//Write a function that takes in the radius as input and returns the circumference of a circle

import java.util.Scanner;
public class findCircumference {

    // Function to calculate and return the circumference of a circle
    public static double getCircumference(double radius) {
        // Formula: Circumference = 2 * π * radius
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Calling the function and printing the result
        double circumference = getCircumference(radius);
        System.out.println("The circumference of the circle with radius " + radius + " is: " + circumference);
        
        scanner.close(); 
    }
}
