package String;

public class test5 
{
	public static void main(String[] args)
	{
		// String is inbuilt Class
		
		String S1="Velocity";
		String S2="";
		String S3="ABCD";
		String S4="VELOCITY";
		String S5="city";
		String S6="abcabab";
		String S7="classes";
		String S8="Manual Classes";
		
		// IN String Class Total 16 number of Methods Present 
		// 1. To get length or size of String==> length(); 'this method used' Result->in that int.
			System.out.println("(1)-----------------------------------------------------");
			System.out.println(S1.length());
			System.out.println(S2.length());
			System.out.println(S3.length());
		// 2. To Verify empty or not==> isEmpty(); 'this method used', Result->in that Boolean type info. 
			System.out.println("(2)-----------------------------------------------------");
			System.out.println(S1.isEmpty());
			System.out.println(S2.isEmpty());
			
		// 3. To Convert into LowerCase==>toLowerCase(); 'this method used',Result->in that String type info.
			System.out.println("(3)-----------------------------------------------------");
			System.out.println(S3.toLowerCase());

		// 3. To Compare 2 String info==> .equal(); 'this method used',Result->in that Boolean type info.
			System.out.println(S1.equals(S4));   //it is case sensitive each and every word same.

		/* 4. To Compare 2 String info ignore Upper or lower case==> .equal(); 
		 * 'this method used',Result->in that Boolean type info.
		 */
			System.out.println("(4)-----------------------------------------------------");
			System.out.println(S1.equalsIgnoreCase(S4));   //it is not case sensitive each and every word same.
			
			
		// 5. Compare Two strings (String S1 And S5)
			System.out.println("(5)-----------------------------------------------------");
			System.out.println(S1.contains(S5));
			
		//6. To Get Character by Providing index
			System.out.println("(6)-----------------------------------------------------");
			System.out.println(S1.charAt(4)); //c
			
		//7. Verify String S1 Start with "Ve"
			System.out.println("(7)-----------------------------------------------------");
			System.out.println(S1.startsWith("Ve"));
			
		//8. Verify String S1 endswith "ty"
			System.out.println("(8)-----------------------------------------------------");
			System.out.println(S1.endsWith("ty"));
		
		//9. to get index by providing character from front 
			System.out.println("(9)-----------------------------------------------------");
			System.out.println(S6.indexOf('b'));
			
		//10. to get index by providing character from Back 
			System.out.println("(10)-----------------------------------------------------");
			System.out.println(S6.lastIndexOf('a'));
			
		//11. To find some Char of String 
			System.out.println("(11)-----------------------------------------------------");
			System.out.println(S1.substring(4));
			
		//12. To find some Char of String 
			System.out.println("(12)-----------------------------------------------------");	
			System.out.println(S1.substring(4, 7));
		
		//13. Concat 2 String 
			System.out.println("(13)-----------------------------------------------------");
			System.out.println(S1+" "+S7);
			
					// OR
			System.out.println("OR");
			System.out.println(S1.concat(S7));
			
		//14. To Replace Word
			System.out.println("(14)-----------------------------------------------------");
			System.out.println(S8.replace("Manual", "Automation"));
	}

}
