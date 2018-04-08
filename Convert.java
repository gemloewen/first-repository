/**

Name:            Convert

Description: 	 Exercise 2

Created By: 	 Gem Loewen

Created On: 	 03/04/2018

*/

import java.util.Scanner;
public class Convert{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

        int choice;
		int temperature;
		int convert;

	do{
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. Exit");
		System.out.print  ("Choice: ");

		choice = input.nextInt();

		switch (choice){
			case 1:
				System.out.print("Enter a teperature: ");
				temperature = input.nextInt();
				convert = celsius(temperature);
				System.out.println(temperature +" Fahrenheit is "+convert+" Celsius\n");
				break;
			case 2:
				System.out.print("Enter temperature: ");
				temperature = input.nextInt();
				convert = fahrenheit(temperature);
				System.out.println(temperature +" Celsius is "+convert+" Fahrenheit \n");
				break;
			case 3:
				break;
			default:
				System.out.println("Please choose from 1-3");
		 }

		   }while(choice != 3);
	     }

	       public static int celsius(int fahrenheit){
		     return (int) ((5.0 / 9.0) * (fahrenheit - 32));
	     }

	       public static int fahrenheit(int celsius){
		     return (int) ((celsius *(9.0 / 5.0))+32);

  }
}//end class