/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class DeclareExcpetion {
  public static void main(String[] args) {
    try {
      int a = 10;
      if (a < 30)
         throw new Exception("value is too small");}    
    catch (Exception ex) {
      System.out.println(ex.getMessage());
        System.out.println("Task 8 by Madhu Babu Arla");
    }}}

