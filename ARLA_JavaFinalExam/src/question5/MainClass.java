/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class MainClass{
	/** Main method */
	public static void main(String[] args) {
		// Create two instances of ComparableCircle objects
		ComparableCircle comparableCircle1 = new ComparableCircle(12.5);
		ComparableCircle comparableCircle2 = new ComparableCircle(18.3);

		// Display comparableCircles
		System.out.println("\nComparableCircle1:");
		System.out.println(comparableCircle1);
		System.out.println("\nComparableCircle2:");
		System.out.println(comparableCircle2);

		// Find and display the larger of the two ComparableCircle objects
		System.out.println((comparableCircle1.compareTo(comparableCircle2) == 1 
			? "\nComparableCircle1 " : "\nComparableCircle2 ") + 
			"is the larger of the two Circles");
                System.out.println("task 5 by Madhu Babu Arla");
        }}

