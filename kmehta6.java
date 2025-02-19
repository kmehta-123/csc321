public class kmehta6
{
	public static void main(String[] args)
	{
		int x = 7, y = 3;
		double dx = 7.0, dy = 3.0;

		int result1_int = x + y * x / y - x;
		int result2_int = -x - y / x * y + x;
		int result3_int = x + y - x / y;

		double result1_double = dx + dy * dx / dy - dx;
		double result2_double = -dx - dy / dx * dy + dx;
		double result3_double = dx + dy - dx / dy;

		System.out.println("Using integers:");
		System.out.println("x + y * x / y - x = " + result1_int);
		System.out.println("-x - y / x * y + x = " + result2_int);
		System.out.println("x + y - x / y = " + result3_int);
		System.out.println();

		System.out.println("Using doubles:");
		System.out.println("x + y * x / y - x = " + result1_double);
		System.out.println("-x - y / x * y + x = " + result2_double);
		System.out.println("x + y - x / y = " + result3_double);
	}
}
