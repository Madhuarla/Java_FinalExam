/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class RecursiveSearch
{
	static int arr[] = {12, 34, 54, 2, 3};
	
	/* Recursive Method to search x in arr[l..r] */
	static int Search(int arr[], int l, int r, int x)
	{
		if (r < l)
			return -1;
		if (arr[l] == x)
			return l;
		if (arr[r] == x)
			return r;
		return Search(arr, l+1, r-1, x);
	}	


public static void main(String[] args)
	{
		int x=54;
		int index = Search(arr, 0, arr.length-1, x);
                System.out.println("Task 10 by Madhu Babu Arla");
		if (index != -1)
			System.out.println("Element " + x + " is present at index " + index);
		else
			System.out.println("Element " + x + " is not present");
		}
}

