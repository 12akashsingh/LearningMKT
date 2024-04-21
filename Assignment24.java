package assignments;
/*Print 1 to 365 if the number is in between 1 to 31 print january, 
if the number is in between 32 to 59 print February....upto December (365 days)*/
public class Assignment24 {
	     	public static void main(String[] args) {
			// TODO Auto-generated method stub
	        for(int i=1;i<=365;i++)
	        {
	        	if(i<=31)
	        	{
	        		System.out.println(i+" Jan");
	        	}
	        	if(i>31 && i<=59)
	        	{
	        		System.out.println(i+" Feb");
	        	}
	        	if(i>59 && i<=90)
	        	{
	        		System.out.println(i+" Mar");
	        	}
	        	if(i>90 && i<=120)
	        	{
	        		System.out.println(i+" Apr");
	        	}
	        	if(i>120 && i<=151)
	        	{
	        		System.out.println(i+" May");
	        	}
	        	if(i>151 && i<=181)
	        	{
	        		System.out.println(i+" Jun");
	        	}
	        	if(i>181 && i<=212)
	        	{
	        		System.out.println(i+" Jul");
	        	}
	        	if(i>212 && i<=243)
	        	{
	        		System.out.println(i+" Aug");
	        	}
	        	if(i>243 && i<=273)
	        	{
	        		System.out.println(i+" Sep");
	        	}
	        	if(i>273 && i<=304)
	        	{
	        		System.out.println(i+" Oct");
	        	}
	        	if(i>304 && i<=334)
	        	{
	        		System.out.println(i+" Nov");
	        	}
	        	if(i>334)
	        	{
	        		System.out.println(i+" Dec");
	        	}
		
	        }
		}

	}

