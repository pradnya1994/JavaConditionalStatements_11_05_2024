package JavaConditionalStatement;

public class Example1_ifStatement {

	public static void main(String[] args) {
		// Write a java program to verify a person is able to cast the vote.
		int personAge = 20;
		if(personAge >= 18)
		{
			System.out.println("Person is eligible to cast the vote.");
		}
		else
		{
			System.out.println("Person is not eligible to cast the vote.");
		}
	}

}
