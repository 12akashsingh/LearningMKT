package JavaBasicPrograms;

public class ThisKeyword 
{
	int age;
	String name;
	double salary;
	void add(int age, String name, double salary)
	{
		this.age=age;//this keyword
		this.name=name;
		//this.salary=salary;
	}
	public static void main(String[] args) 
	{
	ThisKeyword t1=new ThisKeyword();
	t1.add(12, "akash", 0.9);
	System.out.println(t1.age);
	System.out.println(t1.name);
	System.out.println(t1.salary);
	}
}
