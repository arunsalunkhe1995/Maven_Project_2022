package String;

public class test4
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
		String S7="xyz";
		
		/* Create object of string class ( with Using "new" keyword )
		 * this type of information/ object  Are save in "Non Constant pool area"
		 * in that all object having different address
		 */
		
		String S4=new String("xyz");
		String S5=new String("xyz");
		String S6=new String("xyz1");
		
		System.out.println(S1==S2); 	// True
		System.out.println(S1==S3);		// false	    "== is used to compare Address or location or we called Pointer"
		System.out.println(S1==S4);		// false
		System.out.println(S4==S5);		// false
		System.out.println(S5==S6);		// false
		System.out.println(S2==S7);		// True
		
		
		
		
		
	}

}
