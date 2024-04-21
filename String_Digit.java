package assignments;
//How do you check if a String contains only Digits
import java.util.Scanner;

public class String_Digit {

	public static void main(String[] args) 
	{
		int noofchar=0;
		int noofint=0;
		System.out.println("Enter String");
		Scanner s1=new Scanner(System.in);
		String word=s1.next();
		String name=word.toLowerCase();
		
		char a1[]=name.toCharArray();
		System.out.println(a1);
		
		for (int i=0;i<a1.length;i++)
		{
			boolean answer=Character.isDigit(a1[i]);
			if(answer==true)
			{
				noofint++;
			}
			else
			{
				noofchar++;
			}
		}
		if(noofint==name.length())
		{
		System.out.println("Entered string contains DIGIT only : "+noofint+" digits");
		}
		else if(noofchar>0)
		{
		System.out.println("Entered string does NOT contain all digit");	
		}
	}

}
