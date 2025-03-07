import java.util.Scanner;

public class NumberCompare
{

	public static void main(String[] args)
	{
		int answer = 5;
		String prize = "a trophy";
		System.out.print("Guess a number: ");

		Scanner s = new Scanner(System.in);

		int guess = s.nextInt();

		if (guess == answer)
		{
			System.out.println("You win! You get a soda");
		}
		else
		{
			System.out.println("You lose :(");
		}
	}

}
