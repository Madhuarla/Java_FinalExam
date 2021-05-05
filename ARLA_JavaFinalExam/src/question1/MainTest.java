/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
//creating interface
interface test{
public void AInterface();
}
// class test1 which implements interface 
class test1 implements test{ 
	public void AInterface (){
	System.out.println("interface method implement here..");
            System.out.println("task1 By Madhu Babu Arla");}}

//Main class
public class MainTest{
public static void main(String args[]){
test1 tt=new test1 ();//creating object of class
tt. AInterface ();//calling method
}}

