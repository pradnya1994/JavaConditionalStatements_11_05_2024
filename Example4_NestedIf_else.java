package JavaConditionalStatement;

public class Example4_NestedIf_else {

	public static void main(String[] args) {
		
		/**
		 * Write a java program to check whether the given number is positive or negative 
		 * by using if-else conditional statement, if the number is positive check that number
		 * is an even or odd.
		 */
		
		int value = 38;
		
		if(value > 0)
		{
			if(value%2 == 0)
			{
				System.out.println("The number is an even.");
			}
			else
			{
				System.out.println("The number is an odd.");
			}
		}
		else
		{
			System.out.println("The number is negative.");
		}
		
	}

}
