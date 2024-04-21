package JavaBasicPrograms;

public class WhileLoop {

	public static void main(String[] args) 
	{
		String a="ram tiwari";
		System.out.println(a.length());
		int size=a.length();
		while(size>0)
		{
			System.out.println(a);
			size--;
		}
		
		
		String one="I am Vidya Balan";
		String two="I am vidya balan";
		if(one.equalsIgnoreCase(two))
		{
		System.out.println("Both Strings are equal");
		}
		else
		System.out.println("Strings are not equal");
		}
		
	

}
