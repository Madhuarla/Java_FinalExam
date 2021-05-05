/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Madhu Babu Arla <your.name at your.org>
 */
public class recursion {
   public static long fact(long n) {
      if (n <= 1)
         return 1;
      else
         return n * fact(n - 1);
   }
  
   public static long infinity_factorial(long n){
       return n * infinity_factorial(n - 1);  
   }
   public static void main(String args[]) {
      System.out.println("The factorial of 6 is: " + fact(6));
      System.out.println("The factorial of 0 is: " + infinity_factorial(6));
}
}