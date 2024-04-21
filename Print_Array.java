package MKT_Array_String;

import java.util.Arrays;
import java.util.Scanner;

public class Print_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = new int[5];
		
		System.out.println("Enter the Array values");
		Scanner s1=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			ar[i]=s1.nextInt();
		}
		
		String a=Arrays.toString(ar);
		System.out.println(a);
		
		System.out.println("it is working fine");
	}

}
