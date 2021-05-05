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
abstract class test{
	abstract void printtext();}
class text1 extends test{
	void printtext(){System.out.println("Abstract Class Example");}}
class text2 extends test{
	void printtext(){System.out.println("Task 1 By Madhu Babu Arla");}}
public class MainTest1{
	public static void main(String args[]){
	//creating object
	test t1=new text1();
	t1.printtext();
	test t2=new text2();
	t2.printtext();
}}

