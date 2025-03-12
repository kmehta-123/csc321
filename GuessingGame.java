import java.util.Scanner;
import java.util.Random;


public class GuessingGame
{
	public static void main(String[] args)
	{
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);

		int randNum = random.nextInt(20) + 1;

		System.out.println("[randNum = " + randNum + "]");

		System.out.print("Guess a number between 1 and 20: ");
		
		int guess = scan.nextInt();

		while (guess < 1 || guess > 20)
		{
			System.out.println("Error: guess is out of bounds");
			System.out.print("Guess a number between 1 and 20: ");
			guess = scan.nextInt();
		}

		if (guess > randNum)
		{
			System.out.println("Incorrect: guess is too high");
		}
		else if (guess < randNum)
		{
			System.out.println("Incorrect: guess is too low");
		}
		else
		{
			for (int i = 0; i < guess; i++)
			{
				System.out.println("Correct!");
			}
		}

	}
}
