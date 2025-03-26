#include <stdio.h>

int main(void)
{
	int x = 7, y = 3;
	double dx = 7.0, dy = 3.0;

	int result1_int = x + y * x / y - x;
	int result2_int = -x - y / x * y + x;
	int result3_int = x + y - x / y;

	double result1_double = dx + dy * dx / dy - dx;
	double result2_double = -dx - dy / dx * dy + dx;
	double result3_double = dx + dy - dx / dy;

	printf("Using integers:\n");
	printf("x + y * x / y - x = %d\n", result1_int);
	printf("-x - y / x * y + x = %d\n", result2_int);
	printf("x + y - x / y = %d\n\n", result3_int);

	printf("Using doubles:\n");
	printf("x + y * x / y - x = %lf\n", result1_double);
	printf("-x - y / x * y + x = %lf\n", result2_double);
	printf("x + y - x / y = %lf\n", result3_double);

	return 0;
}
