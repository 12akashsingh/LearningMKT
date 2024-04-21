package assignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number for which you want to print Factorial: ");
		
		int num=s1.nextInt();
		
		int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact=fact*i; 
		}
		System.out.println("Factorial of "+num+" = "+fact);
	}
}
