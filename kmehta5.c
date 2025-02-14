// Krish Mehta
// CSC-321
// Lab #5

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main(void)
{
	int age = 21;
	double pi = 3.14;
	char firstInitial = 'k';
	long bigNumber = 9999999;

	printf("the value of age is %d and its address is %p\n", age, &age);
	printf("the value of pi is %f and its address is %p\n", pi, &pi);
	printf("the value of firstInitial is %c and its address is %p\n", firstInitial, &firstInitial);
	printf("the value of bigNumber is %ld and its address is %p\n", bigNumber, &bigNumber);

	{
		int e = 5;
	}

	// printf("the value of e is %d", e);
	
	int arr[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	int i;

	for(i = 0; i < 10; i++)
	{
		printf("arr[%d] --> %p\n", i, &arr[i]);
	}

}
