abstract class Bank
{    
	abstract int getRateOfInterest();	
	
}    
class SBI extends Bank
{    
	@Override
	int getRateOfInterest()
	{
		return 7;
	} 
}    
class ICICI extends Bank
{    
	@Override
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

		// Instantiate TestAbstractBank to use the class and remove the warning
		TestAbstractBank tab = new TestAbstractBank();
		System.out.println("TestAbstractBank instance created: " + tab);
	}
}