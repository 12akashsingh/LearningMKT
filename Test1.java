package JavaBasicPrograms;
//Write  a logic to reverse your name
public class Test1 {
	public static void main(String[] args) {

		String a="akash";
		char revstore;
		for(int i=a.length()-1;i>=0;i--)
		{
			revstore=a.charAt(i);
			System.out.print(revstore);
		}
	
	}

}
