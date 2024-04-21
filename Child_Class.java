package Type_Casting;

class Great_Grand_Parent_Class
{
	public void add()
	{
		System.out.println("Method under Great Grand Parent");
	}
}
class Grand_Parent_Class extends Great_Grand_Parent_Class
{
	public void sub()
	{
		System.out.println("Method under Grand Parent");
	}
}
class Parent_Class extends Grand_Parent_Class
{
	public void mul()
	{
		System.out.println("Method under Parent");
	}
}
public class Child_Class extends Parent_Class
{
	public void div()
	{
		System.out.println("Method under Child Class");
	}
	
	public static void main(String[] args) throws Exception
	{
		Great_Grand_Parent_Class u1=new Grand_Parent_Class(); //UPCASTING
		u1.add();
		
		Grand_Parent_Class u2=new Parent_Class(); //UPCASTING - mandatory for DOWNCASTING
		Parent_Class u3= (Parent_Class) new Grand_Parent_Class(); // DOWNCASTING
		u3.add();
		u3.sub();
		u3.mul();
		
		Child_Class u4=new Child_Class();
		u4.div();
		
	}

}
