package String;

public class Test3 
{
	public static void main(String[] args) 
	{
		/* Create object of string class ( Without Using new keyword )
		 * this type of information/ object  Are save in "Constant pool area"
		 * in that same information of different different object are in same location or we called address
		 */
		
		String S1="xyz";
		String S2="xyz";
		String S3="xyz1";
		
		System.out.println(S1);
		System.out.println(S2);
		System.out.println(S3);
		
	}

}
