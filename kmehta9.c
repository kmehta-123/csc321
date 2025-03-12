// Krish Mehta
// Lab 9

#include <time.h>
#include <stdlib.h>
#include <stdio.h>

int main(void)
{

	srand(time(NULL));

	int randNum = rand() % 20 + 1;

	printf("[randNum = %d]\n", randNum);

	printf("Guess a number between 1 and 20: ");

	int guess = 0;

	scanf("%d", &guess);


	while (guess < 1 || guess > 20)
	{
		printf("Error: guess is out of bounds\n");
		printf("Guess a number between 1 and 20: ");
		scanf("%d", &guess);
	}

	if (guess > randNum)
	{
		printf("Incorrect: guess is too high\n");
	}
	else if (guess < randNum)
	{
		printf("Incorrect: guess is too low\n");
	}
	else 
	{
		int i;
		for (i = 0; i < guess; i++)
		{
			printf("Correct!\n");
		}
	}

	return EXIT_SUCCESS;
}
