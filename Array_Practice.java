package JavaBasicPrograms;

import java.util.Arrays;

public class Array_Practice {

	public static void main(String[] args) 
	{
		
		String a="listen";
		String b="silent";
		
		if(a.length()!=b.length())
		{
			System.out.println("Strings are not ANAGRAM");
		}
		else
		{
			char c[]=a.toCharArray();
			Arrays.sort(c);
			char d[]=b.toCharArray();
			Arrays.sort(d);
			if(Arrays.equals(c,d)==true);
			{
				System.out.println("2 strings are anagram");
			}
			if ((Arrays.equals(c,d)==false))
			{
				System.out.println("Not Anagram");	
			}
		}
	}

}
