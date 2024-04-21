package Encapsulation;

class Auth
{
	private String username="dummyusername@abc.com";
	private String password="abcdefg";
	
	public void setter_username(String username)
	{
		this.username=username;
	}
	
	public void setter_password(String password)
	{
		this.password=password;
	}
	
	public String getter_username()
	{
		return username;
	}
	
	public String getter_password()
	{
		return password;
	}
}

public class login {

	public static void main(String[] args) {
		
		double pie=3.14;
		String pi= toStrings(pie);
		System.out.println(pi);
		Auth a1=new Auth();
		a1.setter_username("akash.singh@gentrack.com");
		a1.setter_password("Test123");
		System.out.println(a1.getter_username());
		System.out.println(a1.getter_password());

	}

	

}
