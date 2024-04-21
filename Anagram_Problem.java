package JavaBasicPrograms;

import java.sql.Array;
import java.util.Arrays;

public class Anagram_Problem {

	public static void main(String[] args) {

		String a1="listen";
		String a2="silent";
		
		if(a1.length()!=a2.length())
		{
			System.out.println("They are not Anagram");
		}
		else
		{
			char c[]=a1.toCharArray();
			Arrays.sort(c);
			
			
			
		}

	}

}
