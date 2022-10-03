package String;

public class ReturnType 
{
	public static void main(String[] args) 
	{
		int S1=M1(20,30);
		System.out.println(S1);
		
		String S2=M2("Retun To Main Method");
		System.out.println(S2);
	}
	
	public static int M1(int a, int b)
	{
		int sum1=a+b;
		System.out.println(sum1);
		
		return sum1;	
	}
	
	public static String M2(String Sname)
	{
		String X=Sname;
		System.out.println(X);
		return X;
		
	}

}
