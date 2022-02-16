package javasessions;

public class ConditionalOperatorsAssignment {

	public static void main(String[] args) {
		
		int num1 = 78;
		int num2 = 87;
		int num3 = 25;
		
		if(num1>num2)
		{
			if(num1>num3)
				System.out.println(num1 + " is greatest ");
		}
		else if(num2>num3)
			System.out.println(num2 + " is greatest ");
		else
			System.out.println(num3 + " is greatest ");
	
	
		int num4 = -35;
		int num5 = 11;
		 if(num4>0)
			 System.out.println(num4 + " is positive");
		 else
			 System.out.println(num4 + " is negative");
		 if(num5>0)
			 System.out.println(num5 + " is positive");
		 else
			 System.out.println(num5 + " is negative");

	}

}
