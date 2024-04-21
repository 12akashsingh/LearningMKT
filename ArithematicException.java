package Exception_Handling;

public class ArithematicException {

	public static void main(String[] args) {
    try
    {
		int c=1/0;
    }
    catch(ArithmeticException ev)
    {
		System.out.println("Since infinity cannot be stored in int datatype");
	}

}
}
