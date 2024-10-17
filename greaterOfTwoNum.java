//Write a function which takes in 2 numbers and returns the greater of those
import java.util.*;
public class greaterOfTwoNum {
    public static void  findGreater(int a,int b){

        if(a > b){
            System.out.println(a +" is Greater");
        }else{
            System.out.println(b+" is Greater");
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first num");
        int a = sc.nextInt();
        System.out.println("Enter your second num");
        int b = sc.nextInt();

        findGreater(a,b);

        sc.close();
    }
}
