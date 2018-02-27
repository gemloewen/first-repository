/**

Name:            Calculating Sales

Description: 	 Exercise 3

Created By: 	 Gem Loewen

Created On: 	 26/02/2018

*/
import java.util.Scanner;

public class CalculatingSales{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double total = 0;
    int productId;



  System.out.println("Enter product number: ");
  productId = input.nextInt();

  while(productId != 0){
    System.out.print("Enter quantity sold: ");
    int quantity = input.nextInt();
     if(productId >= 1 && productId <= 5){
     switch(productId){
       case 1:
         total += quantity * 2.98;
         break;
       case 2:
         total += quantity * 4.50;
         break;
        case 3:
          total += quantity * 9.98;
         break;
        case 4:
          total += quantity * 4.49;
         break;
        case 5:
            total += quantity * 6.87;
         break;


         }//end switch
         }else
           System.out.println("ProductId must be 1 t0 5");

         System.out.println("Please enter product number(0 to stop): ");
         productId = input.nextInt();
      }
      System.out.println("Total of products sold is: ");
      System.out.println(Math.round((total*10000.0)/10000.0));
    }
  }