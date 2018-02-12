//for github lab
import jav.util.Scanner;

public class Menu{

  public static void main(String[] args){
  
    Scanner input = new Scanner(System.in);
    
    System.out.println("Select an option(1-4):");
    
    System.out.print();
    
    System.out.println("1. if...else");
    
    System.out.print("2.While");
    
    System.out.println("3. For");    
    System.out.println("4. Switch");    
    System.out.println(); 
 
    System.out.print("Choice: ");   
    int choice = input.nextInt();     
    System.out.println(); 
 
    switch(choice){      
      case 1:         
      System.out.println("If..else lab");        
      
      break;      
      case 2:        
      System.out.println("While lab");        
      
      break;       
      case 3:       
      System.out.println("For lab");        
     
     break;      
      case 4:         
      System.out.println("Switch lab");         
     
     break;     
      default:         
      System.out.println("Invalid choice");         
     
     break;     
    }     
     System.out.println();  
    } 
} 
