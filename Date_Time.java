package MKT_Array_String;

import java.util.Date;

public class Date_Time {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime()); //EPOCH time
		
		Date d2=new Date(d1.getTime());
		System.out.println(d2); // Human Understandable Present Time
		
		Date d3=new Date(d1.getTime()+(1000*60*60*24*5));
		System.out.println(d3); // Future Time
		
		Date d4=new Date(d1.getTime()-(1000*60*60*24*5));
		System.out.println(d4); //Past Time
				
	}

}
