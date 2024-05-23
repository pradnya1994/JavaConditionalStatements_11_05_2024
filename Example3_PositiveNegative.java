package JavaConditionalStatement;

public class Example3_PositiveNegative {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to check whether the given number is positive or negative 
		 * by using if-else conditional statement.
		 */
		
		int value = 37;
		
		boolean condition = value > 0;
		
		System.out.println(condition);
		
		System.out.println("-----------------------------------------------");
		
		if(condition)
		{
			System.out.println("The number is positive.");	
			System.out.println("------------------------if part executed-----------------------");
		}
		else
		{
			System.out.println("The number is negative.");
			System.out.println("------------------------else part executed-----------------------");
		}
		
	}

}
