//Java program to convert binary number to octal number
import java.util.Scanner;
public class binaryToOctal {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);    
		System.out.print("Enter a binary number : ");
		int binary = sc.nextInt();
		//Declaring variable to store decimal number  
		int decimal = 0;
		//Declaring variable to use in power		
		int n = 0;  
		//writing logic for the conversion from binary to decimal
		while(binary > 0)
		{
			int temp = binary%10;  
			decimal += temp*Math.pow(2, n);  
			binary = binary/10;  
			n++;  
		}
		int octal[] = new int[20];
		int i = 0;
		//writing logic for the conversion from decimal to octal
		while(decimal > 0)
		{
			int r = decimal % 8;
			octal[i++] = r;
			decimal = decimal / 8;
		}
		System.out.print("Octal number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(octal[j]); 

		sc.close();
	}
}