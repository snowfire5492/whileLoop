package whileloop;

/**
 * 
 * File Name: GroupLabWork.java
 * @author: Eric Schenck
 * Date: October 1, 2012
 * 
 * Problem Statement: Write a program to read in a list of exam scores 
 *(integer percentages in the range 0 to 100) and to output the total number 
 *of grades as well as the number of grades in each letter-grade category 
 *(90 - 100 = A, 80 - 89 = B, 70 - 79 = C, 60 - 69 = D, and 0 - 59 = F) and 
 *what percentage of the total grades each letter grade represents. The end of 
 *the input is indicated by a negative score as a sentinel value. (The negative 
 *value is used only to end input from the user, so do not use it in the 
 *calculations.
 *
 * Overall Plan: 
 *1.) import scanner and decimalFormat
 *2.) begin a while loop with a negative sentinel value
 *3.) Prompt user to enter a score
 *4.) create a multi-way if-else statement
 *5.) print off the number of grades, as a gross and individual and percentages
 *of grades.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args) 
    {
     int numberOfAs = 0, numberOfBs = 0, numberOfCs = 0, numberOfDs = 0,
     numberOfFs = 0, numberOfGrades = 0, userInput = 0;
     
     Scanner keyboard = new Scanner(System.in);
     
     
     while (userInput >= 0)
     {
      
      System.out.println("please enter your score on the exam");
      
      userInput = keyboard.nextInt();
      
      
      if (userInput >= 90)
      {
       numberOfAs++;
       numberOfGrades++;
       
      }
      else if (userInput < 90 && userInput >= 80)
      {
       numberOfBs++;
       numberOfGrades++;
      }
      else if (userInput < 80 && userInput >= 70)
      {
       numberOfCs++;
       numberOfGrades++;
      }
      else if (userInput < 70 && userInput >= 60)
      {
       numberOfDs++;
       numberOfGrades++;
      }
      else if (userInput < 60 && userInput >= 0)
      {
       numberOfFs++;
       numberOfGrades++;
      }
      else
      {
       
      }
      
      
     }
     
     double percentAs = numberOfAs / (double) numberOfGrades; 
     
      percentAs = percentAs * 100;
     
     double percentBs = numberOfBs / (double) numberOfGrades;
     
      percentBs = percentBs * 100;
     
     double percentCs = numberOfCs / (double) numberOfGrades;
     
      percentCs = percentCs * 100;
     
     double percentDs = numberOfDs / (double) numberOfGrades;
     
      percentDs = percentDs * 100;
     
     double percentFs = numberOfFs / (double) numberOfGrades;
     
      percentFs = percentFs * 100;
     
     
     DecimalFormat df1 = new DecimalFormat ("##.0");
     
     
     
     
     System.out.println("Total number of grades = " + numberOfGrades);
     System.out.println("Number of A's = " + numberOfAs + " which is "
       + df1.format(percentAs) + "%");
     System.out.println("Number of B's = " + numberOfBs + " which is "
      + df1.format(percentBs) + "%");
     System.out.println("Number of C's = " + numberOfCs + " which is "
      + df1.format(percentCs) + "%");
     System.out.println("Number of D's = " + numberOfDs + " which is "
      + df1.format(percentDs) + "%");
     System.out.println("Number of F's = " + numberOfFs + " which is "
      + df1.format(percentFs) + "%");
     
        
    }
}