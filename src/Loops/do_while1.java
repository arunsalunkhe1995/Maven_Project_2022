package Loops;

public class do_while1
{
      //  print no. from 1 to 5
	
	public static void main(String[] args) 
	{
		// starting condition
		
		int i=1;
		
		do 
		{
			System.out.println(i);
			
			i++;
		}
		while(i<=5);
		
	}
}    //  do while loop not use because of its drawback
	// drawback is 1st number print as it is Without checking condition 
	// mostly we use "for" & "while" loops in programs
