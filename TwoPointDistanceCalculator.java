//*************************************************************************************
// TwoPointDistanceCalculator.java    UNIT 3
//
// Ibrahim Sinan T00636119
// COMP 1131 / Assignment 2 / Chapter 3: "Using Classes and Objects"
//
// 
// This application prompts the user to enter (x,y) coordinates of two points A & B
// and calculates the distance between the two points. 
//*************************************************************************************

import java.util.Scanner;
import java.text.DecimalFormat;
public class TwoPointDistanceCalculator {

	public static void main(String[] args) {
		
		Scanner user_input = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		int x1, x2, y1, y2;
		double x_difference, y_difference, distance;
		
		// inputs (x,y) coordinates of point A
		System.out.print("Enter the x coordinate of point A: ");
		x1 = user_input.nextInt();
		System.out.print("Enter the y coordinate of point A: ");
		y1 = user_input.nextInt();
		
		// inputs (x,y) coordinates of point B
		System.out.print("Enter the x coordinate of point B: ");
		x2 = user_input.nextInt();
		System.out.print("Enter the y coordinate of point B: ");
		y2 = user_input.nextInt();
		
		// calculates X term under the square root of the distance formula
		x_difference = (x2 - x1);
		x_difference = Math.pow(x_difference, 2);
		
		// calculates the Y term under the square root of the distance formula
		y_difference = (y2 - y1);
		y_difference = Math.pow(y_difference, 2);
		
		// add both X & Y differences and calculates square root to find distance
		distance = Math.sqrt(x_difference + y_difference);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("The distance between the two points is: " + distance);
		System.out.println("----------------------------------------------------------");
		System.out.println("Distance result rounded to three digits: " + fmt.format(distance));
	}

}
