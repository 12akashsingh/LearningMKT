package MKT_Array_String;

public class String_Palindrom {

	public static void main(String[] args) {
	
		String str="Madam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			char a=str.charAt(i);
			rev=rev+a;
			
		}
		System.out.println(rev);
		
		if(str.equalsIgnoreCase(rev))
		{
		System.out.println("Two strings are palindrom");	
		}
		else
		{
			System.out.println("Strings are not palindrom");
		}

	}

}
