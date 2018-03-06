/**

Name:            Square

Description: 	 Exercise 4

Created By: 	 Gem Loewen

Created On: 	 06/03/2018

*/

import java.util.Scanner;

public class Square{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter square size: ");
    int side = input.nextInt();

    squareOfAstericks(side);

  }

  public static void squareOfAstericks(int side){
    for(int row = 1; row <= side; row++){
      for(int col = 1; col <= side; col++){
        System.out.print("*");
      }
      System.out.println();
     }
   }
 }