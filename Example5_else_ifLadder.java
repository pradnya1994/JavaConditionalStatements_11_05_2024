package JavaConditionalStatement;

public class Example5_else_ifLadder 
{

	public static void main(String[] args)
	{
		
		/**
		 * Write a java program to generate grade system using else-if ladder for 
		 * given student marks?
		 * 
		 */
		
		int marks = 75;
		
		if(marks <= 100 && marks > 70)
		{
			System.out.println("Distinction");
		}
		else if(marks <= 70  && marks > 60)
		{
			System.out.println("First class");
		}
		else if(marks <= 60  && marks > 50)
		{
			System.out.println("Second class");
		}
		else if(marks <= 50  && marks > 40)
		{
			System.out.println("Third class");
		}
		else if(marks == 40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail.");
		}
		
	}

}
