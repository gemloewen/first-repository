/**

Name:            ThirdArray

Description: 	 Exercise 6

Created By: 	 Gem Loewen

Created On: 	 13/03/2018

*/

public class ThirdArray {
  public static void main(String[] args){
    int[] x = new int[5];
    
    for(int i = 0; i< x.length; i++){
      x[i] = i + 1;
    }
    
     System.out.println("Index\tValue\n");
         
     for(int i = 0; i< x.length; i++){
       System.out.println(i+"\t"+x[i]);
     
   }
    
  }
}