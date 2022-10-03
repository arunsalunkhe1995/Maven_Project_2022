package Arrays;

public class multidimentional_3 
{
	public static void main(String[] args) 
	{

		/*    				Column index
		 * 
		 * 					0		1		2
		 * 
		 *    Row	 0		10		20		30
		 *   Index  
		 *  		 1		40		50		60
		 *  
		 *  	int [row index size][column index size];
		 */
		// array declaration And Initialization
					// Row1=0   // Row2=1
		int I3[][]= {{10,20,30},{40,50,60}};
		
		// usage
		
		// outer for loops for row index
		for (int i=0; i<=1; i++)
		{
			// Inner for loops for Column index
			
			for (int a=0; a<=2; a++)
			{
				System.out.print(I3[i][a]+" ");
			}
			
			System.out.println();
			
		}
		
	}


}
