package Arrays;

import java.util.Arrays;

public class arrayAcsDesc1 
{
	public static void main(String[] args)
	{
		// array Declaration 
		
				int I2[]=new int[5];
				
				// array initialization 
				
				I2[0]=400;
				I2[1]=200;
				I2[2]=500;
				I2[3]=100;
				I2[4]=300;
				
				// Uses
				
				Arrays.sort(I2);				// Inbuilt method
				
				for (int i=4; i>=0; i--)
				{
					System.out.println(I2[i]);
				}
				
				
		
	}

}
