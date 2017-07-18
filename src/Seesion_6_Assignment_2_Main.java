import java.util.Scanner ; 
public class Seesion_6_Assignment_2_Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserInputAge in = new UserInputAge();
		try
		{
		 in.getVoterAge();
		 in.eligibilityToVote(); 
		}
		catch(NegativeAgeException msg)
		{
			System.out.println("Negative Value Exception : " +msg);
		}

	}

}

class UserInputAge 
{
	int Voter_age ; 
	Scanner input = new Scanner(System.in);
	
	public void getVoterAge()
	{
		System.out.println("Enter the Age of the Voter : ");
		Voter_age = input.nextInt();
	
	}
	//Throws the Negative Exception here....
	public void eligibilityToVote() throws NegativeAgeException
	{
		if(Voter_age >= 0)
		{
			if((Voter_age >= 18) && (Voter_age > 0))
			{
				System.out.println("Person is eligible to Vote");
			}
			else
			{
				System.out.println("Person is not eligible to Vote or Input Voter Age is Zero");
			}
		}
		else
		{
			throw new NegativeAgeException("Please Enter Non Negative Number");
		}
	}
	
}

class NegativeAgeException extends Exception
{
	private String Message = " "; 
	NegativeAgeException(String s)
	{
			Message = s ;
	}
	
	public String toString()
	{
		return Message ; 
	}
	
}
/*
 * 
 * OUTPUT : 
 * Enter the Age of the Voter : 
   24
   Person is eligible to Vote
   
 * Enter the Age of the Voter : 
	-18
	Negative Value Exception : Please Enter Non Negative Number 
 * 
 */
