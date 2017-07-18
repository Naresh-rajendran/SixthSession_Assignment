import java.util.*;
public class Session_6_Assignment_4_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAtm  obj1 = new  BankAtm(); 
		BankAtm  obj2 = new  BankAtm();
		BankAtm  obj3 = new  BankAtm();
		
		Scanner in = new Scanner(System.in);
	
		obj1.getDetails();
		
		System.out.println("Enter the Deposit anount");
        obj1.deposit(in.nextDouble());
        
        System.out.println("Enter the amount to be WithDrawn : OBJECT 1 ");
        try
        {
        	obj1.withDraw(in.nextDouble());
        	
        }
        catch(BankATMException e)
        {
        	System.out.println("Exception Caught : "+e.getMessage());
        	
        }
        
        System.out.println("Enter the amount to be WithDrawn : OBJECT 2 ");
        try
        {
        	obj2.withDraw(in.nextDouble());
        	
        }
        catch(BankATMException e)
        {
        	System.out.println("Exception Caught : "+e.getMessage());
        	
        }
        
        System.out.println("Enter the amount to be WithDrawn : OBJECT 3 ");
        try
        {
        	obj3.withDraw(in.nextDouble());
        	
        }
        catch(BankATMException e)
        {
        	System.out.println("Exception Caught : "+e.getMessage());
        	
        }
     
        in.close();
	}

}

class BankAtm
{
	public String bankName , location ; 
	public int atmID ; 
	public static double balance ; 
	Scanner input = new Scanner(System.in);
	
	void getDetails()
	{
		System.out.println("Enter the Bank Name ");
		bankName = input.nextLine();
		
		System.out.println("Enter the ATM Location");
		location = input.nextLine();
		
		System.out.println("Enter the ATM ID");
		atmID = input.nextInt();
	}
	//Throws Exception if the amount the less than 10000 and if withdrawn > balance amount  
	void withDraw(double amt)throws BankATMException
	{
		double withDraw_Amount = amt ; 
		if(balance >= 10000)
		{
		      if(withDraw_Amount > balance)
		      {
		    	  throw new BankATMException("The With Drawal amount is greater than balance can't with draw amount");
		      }
		      else
		      {
		    	  balance = balance - withDraw_Amount ;
		    	  System.out.println("Amount to be With Drawn : " +withDraw_Amount);
		    	  System.out.println("Balance Amount          : " +balance);
		      }
		}
		else
		{
			throw new BankATMException("The Balance amount is less than 10000 can't Withdraw amount");
		}
	}
	
	void deposit(double amt)
	{
		balance = amt ; 
		printDetails();
		System.out.println("Balance Amount  : " +balance);
	}
	
	void printDetails()
	{
		System.out.println("   Bank Name    : " +bankName);
		System.out.println("ATM Location    : " +location);
		System.out.println("      ATM ID    : " +atmID);
	}
}

class BankATMException extends Exception
{
	private String message = " " ;  

	BankATMException(String s)
	{
		message = s ;
	}
	
   public String getMessage()
	{
		return message ;
	}
	
}


/*
 
OUTPUT : 

Enter the Bank Name 
HDFC Bank 
Enter the ATM Location
Gandhi Road, Chennai
Enter the ATM ID
13235
Enter the Deposit anount
25000
   Bank Name    : HDFC Bank 
ATM Location    : Gandhi Road, Chennai
      ATM ID    : 13235
Balance Amount  : 25000.0
Enter the amount to be WithDrawn : OBJECT 1 
20000
Amount to be With Drawn : 20000.0
Balance Amount          : 5000.0
Enter the amount to be WithDrawn : OBJECT 2 
10000
Exception Caught : The Balance amount is less than 10000 can't Withdraw amount
Enter the amount to be WithDrawn : OBJECT 3 
5000
Exception Caught : The Balance amount is less than 10000 can't Withdraw amount


*/
