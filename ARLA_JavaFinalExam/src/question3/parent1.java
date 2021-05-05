/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
	class Parent{
String name;
void print() { System.out.println("method is from parent class"); }
}
class Child extends Parent{
	int ID;
void print1(){System.out.println("method is from child class"); }
}
class MainTest{
public static void main(String args[]){
//this is the process of upcasting
	Parent p=new Child();
	p.name="upcasting";
	System.out.println(p.name);
	p.print();
// this is the process of downcast, externally 
        Child ch = (Child)p;
        ch.ID = 63;
        System.out.println(ch.name);
        System.out.println(ch.ID);
        ch.print1();
        System.out.println("Task 3 by Madhu Babu Arla");
}}

