package assignments;

public class Swapwithout3var {

	public static void main(String[] args) {
		int a=5,b=7;
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		System.out.println("-------------------");
		a=a+b; //=12
		b=a-b; //=12-7=5
		a=a-b; //=12-5=7
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
}
