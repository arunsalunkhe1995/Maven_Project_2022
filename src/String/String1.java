package String;

public class String1
{
	public static void main(String[] args)
	{
		/* Create object of string class ( Using new keyword )
		 * this type of information/ object  Are save in "Non Constant pool area"
		 * in that all object having different address
		 */
		
		String S1=new String("xyz");
		
		System.out.println(S1);
		
		/* Create object of string class ( Without Using new keyword )
		 * this type of information/ object  Are save in "Constant pool area"
		 * in that same information of different different object are in same location or we called address
		 */
		
		String S2="xyz1";
		
		System.out.println(S2);
	}

}
