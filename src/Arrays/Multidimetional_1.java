package Arrays;

public class Multidimetional_1 
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
		 *  			int [row index size][column index size];
		 */
		// array declaration
		
		int I2[][]=new int[2][3];
		
		// array initialization
		// I2[Row index][column index]
		
		I2[0][0]=10;
		I2[0][1]=20;
		I2[0][2]=30;
		I2[1][0]=40;
		I2[1][1]=50;
		I2[1][2]=60;
		
		// Usage
		
		// outer for loops for row index
		
		for(int i=0; i<=1; i++)
		{
			// inner for loop for column index
			
			for(int a=0; a<=2; a++)
			{
				System.out.println(I2[i][a]);
			}

		}

	}
}
