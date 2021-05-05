/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.io.*;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
class MainTest {
	public static void main(String[] args) {
    try {
        FileReader f = new FileReader("filenamehere.txt"); //reading file
    } 
    catch (FileNotFoundException e) { //file not found error handle here
        //printing the error
        e.printStackTrace();
	//printing human readable message
	System.out.println("file not find");
        System.out.println("Task 6 by Madhu Babu Arla");
    }
}}

