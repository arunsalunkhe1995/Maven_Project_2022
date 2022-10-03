package Arrays;

import java.util.Arrays;

public class arrayAscDesc 
{
	public static void main(String[] args) 
	{
		// array Declaration 
		
		int I1[]=new int[5];
		
		// array initialization 
		
		I1[0]=400;
		I1[1]=200;
		I1[2]=500;
		I1[3]=100;
		I1[4]=300;
		
		// uses
		Arrays.sort(I1);
		
		for(int i=0; i<=4; i++ )
		{
			System.out.println(I1[i]);
		}
		
		
		
		
		
	}
	
	

}
