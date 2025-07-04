abstract class Bank
{    
	abstract int getRateOfInterest();	
	
}    
class SBI extends Bank
{    
	int getRateOfInterest()
	{
		return 7;
	} 
}    
class ICICI extends Bank
{    
	int getRateOfInterest()
	{
		return 8;
	}    
}    
 class TestAbstractBank
{    
	public static void main(String args[])
	{    
		Bank o;
	      
	    o = new SBI();  
	    System.out.println("Rate of Interest is: "+o.getRateOfInterest()+"%");  
		
	    o=new ICICI();  
	    System.out.println("Rate of Interest is: "+o.getRateOfInterest()+"%");    
	}
}