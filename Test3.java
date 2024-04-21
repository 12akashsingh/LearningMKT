package JavaBasicPrograms;

import java.util.Arrays;

//Given Input String as "world is full of beautiful people"
//Write a program to count the number of alphabets used here, 
//sort it and print all the alphabets 
public class Test3 {

	public static void main(String[] args) {
	String sent="world is full of beautiful people";
	int alphacount=0;
	int spacecount=0;
	char a1[]=sent.toCharArray();
	Arrays.sort(a1);
	
	System.out.print("Available Alphabets = ");
	for (int i=0;i<a1.length;i++)
	{
		boolean answer1=Character.isAlphabetic(a1[i]);
		boolean answer2=Character.isWhitespace(a1[i]);
	
     	if(answer1==true)
		{
     		alphacount++;
     		System.out.print(a1[i]);
     		     		
		}
		else if (answer2==true) 
		{
			spacecount++;
		}
	}
	System.out.println();
	System.out.println("Entered string contains Alphabets count = "+alphacount );
	System.out.println("Entered string contains Space count = "+spacecount );
	
	}


	}

