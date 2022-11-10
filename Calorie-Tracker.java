
/*--------------------------------------------------------------------
 
Gabriela Muriel
 
--------------------------------------------------------------------*/


import java.util.Scanner;

class CalorieTracker {
  public static void main(String[] args) {
     
    Scanner input = new Scanner(System.in);
    String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
    String[] meals = {"Breakfast", "Lunch", "Dinner","Snacks"};
    double[][] calories = new double[7][4];
    double[] average = new double[7];
    double[] total = new double[7];


    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("                     Hello and Welcome!                     ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    
    for (int i = 0; i < days.length; i++){
      for (int j = 0; j < calories[0].length; j++){
        System.out.println("");
        System.out.println("Your calories on " + days[i] + " at " + meals[j] +":");
        System.out.println("");
        double how_much_eat = input.nextDouble();

        if (how_much_eat < 0){
          System.out.println("");
          System.out.println("Error! Enter a positive number! (╯°□°）╯ ");
          System.exit(0);
        }
          
        calories[i][j] = how_much_eat;
      }
    }
    
    double daily;

    for (int i = 0; i < days.length; i++){
      
      daily = 0;
      
      for (int j = 0; j < calories[0].length; j++){
        daily += calories[i][j];
        
      }
      total[i] = daily;
      average[i] = daily / 4;
      
    }  

    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    
    int i = 0;
    
    for(String weekday : days){
      System.out.println("                     " + weekday);
      System.out.println("         Daily average calories:   " + average[i]);
      
      System.out.println("         Total calories:   " + total[i]);
      i++;

      System.out.println(" ");
    }
    
    double min = calories[0][0];
    double max = calories[0][0];
    
    for (i = 0; i < 7; i++){
      for (int j = 0; j < 4; j++){
        if (calories[i][j] < min){

          min = calories[i][j];
        }

        if (calories[i][j] > max){

          max = calories[i][j];
        }
    
        
      }
      
    }
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("   The smallest amount of calories is " + min + " calories!");
    System.out.println("   The largest amount of calories is " + max + " calories!");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("✿ॱ॰♡♡♡ ͡━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━✫・*。");
    System.out.println("");
    System.out.println("");
    System.out.println("                       THANK YOU!!!");
    
    
  
  }
}
