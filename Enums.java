/**

Name:            Enums

Description: 	 Exercise 6

Created By: 	 Gem Loewen

Created On: 	 06/03/2018

*/

public class Enums{



  public enum Month{
    JANUARY, FEBUARY, MARCH, APRIL, MAY, JUNE,
    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
  }

  public enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
 }

  public static void main(String[] args){

    int months = Month.values().length;
    int days = Day.values().length;
    System.out.println("Number of months in a year: "+months);
    System.out.println("Number of days in a week: "+days+"\n");

    System.out.println("Months: \n");
    for(int i = 0; i < months;i++){
	  System.out.println(Month.values()[i]);
}
    System.out.println("\nDays: \n");
    for(Day d: Day.values()){
      System.out.println(d);
    }
    System.out.println();
  }
}

