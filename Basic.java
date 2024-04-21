package Assertion;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int input=s1.nextInt();
		assert input>10:"input is lesser";
		int a=2;
		int b=4;
		int sum=a+b;
		System.out.println(sum);
	}

}
