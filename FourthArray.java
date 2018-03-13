/**

Name:            FourthArray

Description: 	 Exercise 7

Created By: 	 Gem Loewen

Created On: 	 13/03/2018

*/

public class FourthArray {
  public static void main(String[] args){
      int[] x = {7, 6, 11, 15, 19};
      int total = 0;



      for(int i = 0; i < x.length; i++){
        total += x[i];

      }
      System.out.println("Sum of array value is: "+total);

  }
}
