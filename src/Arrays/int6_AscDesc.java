package Arrays;

import java.util.Arrays;

public class int6_AscDesc
{
	 	
		public static void main(String[] args)
			
			{
				// Array  declaration and initialization 
				int I1[]= {600, 500, 300, 700, 200, 400, 100};
				
				// usage
				
				Arrays.sort(I1);
				
				for (int i=0; i<=6; i++)
				{
					System.out.println(I1[i]);
					
				}
			}

}
