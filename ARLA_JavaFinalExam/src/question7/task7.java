/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

import java.util.Scanner;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class task7{
	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		int[] array1 = getArray1();
                System.out.println("Task 7 by Madhu Babu Arla");
		System.out.print("Enter the index of the array: ");
		try {
			System.out.println("The corresponding element value is " + 
				array1[input1.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
                        
		}
	}
	public static int[] getArray1() {
		int[] array2 = new int[100];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int)(Math.random() * 100) + 1;
		}
		return array2;
                
        }}

