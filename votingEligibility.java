//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

import java.util.Scanner;
public class votingEligibility {
    public static String checkVotingEligibility(int age) {
        if (age > 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Calling the function and printing the result
        String result = checkVotingEligibility(age);
        System.out.println(result);
        
        scanner.close();
    }
}