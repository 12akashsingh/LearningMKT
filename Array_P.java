package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Array_P {
int asd;
	public static void main(String[] args) {
		int a[]=new int[5];
		//int rev[]=new rev[5];
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
		a[i]=s1.nextInt();
		}
		
		String b=Arrays.toString(a);
		System.out.println("Array is "+ b);
		System.out.println(a.length);
		/* //For reversing the array
		for (int j=5;j>0;j--)
		{
		  rev         =a[j];
		}*/
	}

}
