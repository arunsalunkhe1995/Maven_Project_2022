package Arrays;

public class int3 
{
	public static void main(String[] args)
	{	
		// using length concept in for loop
		// array declaration
		
		int Ar3[]=new int[4];
		
		// array initialization
		
			Ar3[0]=600;
			Ar3[1]=200;
			Ar3[2]=400;
			Ar3[3]=900;
			
		// uses
			
			for(int i=0; i<=Ar3.length-1; i++)
			{
				System.out.println(Ar3[i]);
			}
			
		System.out.println("-----------------------------------------------------------------------");
		
		
		for(int a=0; a<4; a++) 
		{
			System.out.println(Ar3[a]);
			
		}
		
	}

}
