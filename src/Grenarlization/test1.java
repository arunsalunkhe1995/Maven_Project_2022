package Grenarlization;

public class test1 
{
	public static void main(String[] args)
	{
		System.out.println("Implementation class 1");
		
		Jio J1=new Jio();
			J1.sms();
			J1.audiocalling();
			J1.internet();
			
	    System.out.println("Implementation class 2");	
		
	    airtel A1=new airtel();
	    	   A1.sms();
	    	   A1.audiocalling();
	    	   A1.internet();

	    System.out.println("Implementation class 3");
	    	   
	    VI V1=new VI();
	       V1.sms();
	       V1.audiocalling();
	       V1.internet();
	}

}

