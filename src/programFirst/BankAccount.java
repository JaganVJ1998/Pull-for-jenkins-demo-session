package programFirst;

public class BankAccount {

	String proof = "License";
	
	public void proofCheck()
	{
		switch(proof)
		{
		case "Pan":
			System.out.println(proof + " is a valid proof to open bank account");
			break;
		
		case "License":
			System.out.println(proof + " is a valid proof to open bank account");
			//break;
			
		case "Voterid":
			System.out.println(proof + " is a valid proof to open bank account");
			//break;
			
		case "Passport":
			System.out.println(proof + " is a valid proof to open bank account");
			break;
			
		case "Aadhar":
			System.out.println(proof + " is a valid proof to open bank account");
			break;
			
		default:
			System.out.println(proof + " is not a valid proof to open bank account");
			break;
				
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		BankAccount b = new BankAccount();
		b.proofCheck();
	}
	
}
