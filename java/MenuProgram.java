import java.util.Scanner;

public class MenuProgram 
{

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		while (true)
		{
			// Display menu
			System.out.println("\nChoose an option:");
			System.out.println("1. Motivational Quote");
			System.out.println("2. Fun Fact");
			System.out.println("3. Joke");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice)
			{
				case 1:
					System.out.println("\"Success is not final, failure is not fatal: it is the courage to continue that counts.\" - Winston Churchill");
					break;
				case 2:
					System.out.println("Did you know? Honey never spoils. Archaeologists have found pots of honey in ancient Egyptian tombs that are over 3,000 years old and still perfectly good to eat!");
					break;
				case 3:
					System.out.println("Why don't skeletons fight each other? Because they don't have the guts!");
					break;
				case 4:
					System.out.println("Goodbye! Have a great day!");
					scanner.close();
					return;
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 4.");

			}
		}
	}


}
