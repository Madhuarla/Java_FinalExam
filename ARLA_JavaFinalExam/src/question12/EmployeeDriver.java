/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class EmployeeDriver{
public static void main(String[] args)  
       {  
          List<Employee> employeeList= new ArrayList<Employee>(); 
           employeeList.add(new Employee(20, "Mike", 260000));  
           employeeList.add(new Employee(10, "Lora", 10000));  
           employeeList.add(new Employee(30, "Daniel", 5000)); 
	   employeeList.add(new Employee(80, "Bob", 52000)); 
	   employeeList.add(new Employee(50, "Jorge", 46000));  
     
          System.out.println("************Printing Original List**************");
 		for(var emp:employeeList){  
			System.out.println(emp);  
            		}      


System.out.println("************Printing sorted List by ID**************");
	Collections.sort(employeeList);
        // Default Sorting by employee id
        for(var emp:employeeList){  
			System.out.println(emp);  
            		}  

System.out.println("************Printing sorted List by Salary**************");
Collections.sort(employeeList, new salarysorting());
       for(var emp:employeeList){  
			System.out.println(emp);  
            		}       

System.out.println("************Printing sorted List by Name**************");  
Collections.sort(employeeList, new namesorting());
 
        for(var emp:employeeList){  
			System.out.println(emp);  
            		}  
           System.out.println("Task 12 by Madhu Babu Arla");
           
}  
}

