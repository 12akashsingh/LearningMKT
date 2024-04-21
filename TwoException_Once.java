package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

class TwoException_Once {

	public static void main(String[] args) {
		int ar[]=new int[3];
		Scanner s1=new Scanner(System.in);
		System.out.println("Print Int Array length 3(0,1,2), Test:   ");
		
		try
		{
		for(int i=0;i<3;i++)
		{
			ar[i]=s1.nextInt();
		}
		ar[3]=s1.nextInt();
		}
		
		catch(InputMismatchException ev)
		{
		System.out.println("Catch 1: Datatype mismatch");	
		}
		catch(ArrayIndexOutOfBoundsException ev)
		{
		System.out.println("Catch 2: ArrayIndexOutOfBoundsException mismatch");	
		}
				
	}

}
