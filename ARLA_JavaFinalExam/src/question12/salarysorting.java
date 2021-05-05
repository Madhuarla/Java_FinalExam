/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.Comparator;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class salarysorting implements Comparator<Employee>{
 
@Override
public int compare(Employee emp1, Employee emp2) {
return emp1.getSalary() - emp2.getSalary();
}
}

