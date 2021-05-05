/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question11;
// hashCode() and equals() work
import java.io.*;


/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class HashEqual
{
	
	public String name;
	public int id;
		
	HashEqual(String name, int id)
	{
			
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		
	// check both the object reference are referring to the same object or not?
	if(this == obj)
			return true;
		
		// checks if the argument is of the
		// type by compare the classes
		if(obj == null || obj.getClass()!= this.getClass())
			return false;
		
		//  argument casting
		HashEqual testing= (HashEqual) obj;
		
		// argument state comparing
		return (testing.name == this.name && testing.id == this.id);
	}
	
	@Override
	public int hashCode()
	{
		
		// return the ID as hash code value
		return this.id;
	}
	
}

class testclass
{
	
	public static void main (String[] args)
	{
	
		// objects are creating of the class
		HashEqual test1 = new HashEqual ("mac", 1);
		HashEqual test2 = new HashEqual ("mac", 1);
		
		// now objects created are compared here
                System.out.println("Task 11 by Madhu Babu Arla");
		if(test1 .hashCode() == test2.hashCode())
		{

			if(test1.equals(test2))
				System.out.println("Both Objects are equal. ");
			else
				System.out.println("Both Objects are not equal. ");
	
		}
		else
		System.out.println("Both Objects are not equal. ");
                
	}
}

