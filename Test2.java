package JavaBasicPrograms;

import java.util.Arrays;
import java.util.Scanner;

///In a array of 4 size store four values in it from human input
//and consider those 4 values are the 4 length of the rectangle.
//Please a logic to find out the area for the same
//[write the program in eclipse and copy paste the program here]
public class Test2 {
public static void main(String args[])
{
	int ar1[]=new int[4];
	int areaRect=1;
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the sides of rectangle");
	for(int i=0;i<ar1.length;i++)
	{
		ar1[i]=s1.nextInt();
		areaRect=areaRect*ar1[i];//2(length*width);
	}
	System.out.println("Array: "+ Arrays.toString(ar1));
	System.out.println("Area of the sides would be "+areaRect);
}
}
