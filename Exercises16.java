package chapters.Chapter02.Exercises;

import java.util.Scanner;

public class Exercises16 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the side: ");
		double side = keyboard.nextDouble();
		double area = (( 3 * Math.pow(3, 0.5) )/ 2 ) * side * side;
		System.out.println("The area of the hexagon is : " + area );
		
																
	}

}
