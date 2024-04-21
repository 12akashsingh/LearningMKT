package assignments;

import java.util.Scanner;

public class Assignment36 {

	public static void main(String[] args) {
     String input;
     String output="";
     Scanner s1= new Scanner(System.in);
     System.out.println("Enter the word: ");
     input=s1.next();
     for(int i=input.length()-1;i>=0;i--)
     {
    	char a= input.charAt(i);
    	output=output+a;
  	 }
         if (input.equals(output))
     {
    	 System.out.println("WORD is PALINDROME");
     }
         else
        	 System.out.println("Number is not PALINDROME");
	

	}

}
