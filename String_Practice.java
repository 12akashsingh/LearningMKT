package JavaBasicPrograms;

import java.util.Arrays;

public class String_Practice {

	public static void main(String[] args) {
	String text="akash singh";

	System.out.println(text.concat(" tester"));
	System.out.println("Length: "+text.length()); 
	System.out.println(text.substring(6, 11));
	System.out.println(text.substring(4));
	System.out.println(text.indexOf("h"));
	
    //Replace a with s
	System.out.println(text.replace('a','n'));
	//Replace akash with sagar
	System.out.println(text.replaceAll("akash","sagar"));
	revstring();
	}
	
	static void revstring()
	{
	String abc="abcdef";
	for(int j=abc.length()-1;j>=0;j--)
	{
		System.out.print(abc.charAt(j));
	}

	char a[]=abc.toCharArray();
	for(int i=0;i<abc.length();i++)
	{
		System.out.println(a[i]);

	}
	System.out.println(Arrays.toString(a));
	}

}
