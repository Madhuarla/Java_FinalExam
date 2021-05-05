/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;
import java.io.*;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
class MainTest {
	public static void main(String[] args) throws IOException,Exception,FileNotFoundException
{
    try
    {
        FileReader file = new FileReader("filename.txt");
    } 
    catch (FileNotFoundException e) 
    {
	//printing human readable message
	System.out.println("File not find");
        System.out.println("Task 9 by Madhu Babu Arla");
    }
}}

