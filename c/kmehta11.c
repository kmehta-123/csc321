// Krish Mehta
// CSC 321
// Lab 11

#include <stdlib.h>
#include <stdio.h>
#include <math.h>

double hypotenuse(double base, double height);

int main() {

	double base;
	double height;

	printf("Base: ");
	scanf("%lf", &base);

	printf("Height: ");
	scanf("%lf", &height);

	double hyp = hypotenuse(base, height);

	printf("Hypotenuse: %lf\n", hyp);

	return EXIT_SUCCESS;

}

double hypotenuse(double base, double height) {

	return sqrt(base * base + height * height);

}
