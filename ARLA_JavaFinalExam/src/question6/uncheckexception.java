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
class uncheckexception{ 
 public static void main(String args[]){
	try{  
 int arr[]={1,2,3,4}; 
//array has only 4 elements and we are trying to access 12 element which give us exception //at runtime not at compile time
System.out.println(arr[12]);}
	catch(ArrayIndexOutOfBoundsException e){  
//exception arrayindexoutofbound catches here
// printing the message that we want to show 
System.out.println("specified index doesnot exists");
            System.out.println("task 6 By Madhu Babu Arla ");
}}}

