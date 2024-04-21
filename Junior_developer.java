package Encapsulation;

class Senior_developer
{
	private int age=18;
	
	public int get_age() 
	{
		return age;
	}
	
	public void set_age(int age) 
	{
	this.age=age;	
	}
}
public class Junior_developer {

	public static void main(String[] args) 
	{
		Senior_developer s1=new Senior_developer();
		s1.set_age(72);
		System.out.println(s1.get_age());
	}

}
