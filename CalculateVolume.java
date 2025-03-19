// Krish Mehta
// CSC 321
// Lab 10

import java.util.Scanner;
import java.lang.Math;

public class CalculateVolume {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Radius: ");
		double radius  = s.nextDouble();

		System.out.print("Height: ");
		double height = s.nextDouble();

		double volume = calculateVolume(radius, height);

		System.out.println("Volume: " + volume); 

	}

	static double calculateVolume(double radius, double height) {
	
		double circleArea = Math.PI * radius * radius;
		
		return circleArea * height;

	}

}
