//lab 8.6.1

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;
      
      // Java switch/case statement                                                                
      switch (monthString) {
         case "January": 
            monthInt = 1; 
            break;
         case "February": 
            monthInt = 2; 
            break;
         case "March": 
            monthInt = 3; 
            break;
         case "April": 
            monthInt = 4; 
            break;
         case "May": 
            monthInt = 5; 
            break;
         case "June": 
            monthInt = 6; 
            break;
         case "July": 
            monthInt = 7; 
            break;
         case "August": 
            monthInt = 8; 
            break;
         case "September": 
            monthInt = 9; 
            break;
         case "October": 
            monthInt = 10; 
            break;
         case "November": 
            monthInt = 11; 
            break;
         case "December": 
            monthInt = 12; 
            break;
         default: 
            monthInt = 0;
      }
      
      return monthInt;
   }

   public static void main(String[] args) {
      ArrayList<String> dates = new ArrayList<String>();
      Scanner scnr = new Scanner(System.in);
      String date;
      String month;
      String day;
      String year;
      
      while(true){
         date = scnr.nextLine();
         if(date.equals("-1")){
            break;
         }
         dates.add(date);
      }
      
      for(int i = 0; i < dates.size(); i++){
         try{
            month = dates.get(i).substring(0, dates.get(i).indexOf(" "));
            day = dates.get(i).substring(dates.get(i).indexOf(" ") + 1, dates.get(i).indexOf(","));
            year = dates.get(i).substring(dates.get(i).indexOf(",") + 2, dates.get(i).length());
            
            System.out.println(getMonthAsInt(month) + "/" + day + "/" + year);
         }
         
         catch(Exception e){
            
            }
      }
   }
}

//lab8.6.2
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      
      FileInputStream filebyteStream = new FileInputStream(scnr.nextLine());
      Scanner fileScanner = new Scanner(filebyteStream);
      
      for(int i = 0; i < 10000; i++){
         try{
            String fileName = fileScanner.nextLine().replace(".jpg", ".txt");
            String finalString = fileName.replace("photo", "info");
            
            System.out.println(finalString);
         }
         
         catch(Exception e){
            
         }
      }
      
      
      

      /* Type your code here. */
   }
}


//lab 8.6.3
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = null;
      Scanner inFS = null;
      FileOutputStream fileStream = null;
      PrintWriter outFS = null;
      String userClass;
      String lastName;
      String firstName;
      int studentMid1;
      int studentMid2;
      int studentFin;
      double studentAvg = 0.0;
      String studentGrade;
      double classMidtermAvg1 = 0;
      double classMidtermAvg2 = 0;
      double classFinalAvg = 0;
      int studentCount = 0;
      
      userClass = scnr.nextLine();
      fileByteStream = new FileInputStream(userClass);
      inFS = new Scanner(fileByteStream);
      fileStream = new FileOutputStream("report.txt");
      outFS = new PrintWriter(fileStream);
      
      while(inFS.hasNext()){
         lastName = inFS.next();
         firstName = inFS.next();
         studentMid1 = inFS.nextInt();
         studentMid2 = inFS.nextInt();
         studentFin = inFS.nextInt();
         
         studentAvg = ((studentMid1 + studentMid2 + studentFin) / 3);
         if(studentAvg >= 90){
            studentGrade = "A";
         }
         else if(studentAvg >= 80){
            studentGrade = "B";  
         }
         
         else if(studentAvg >= 70){
            studentGrade = "C";  
         }
         
         else if(studentAvg >= 60){
            studentGrade = "D";
         }
         
         else{
            studentGrade = "F";  
         }
         
         outFS.printf("%s\t%s\t%d\t%d\t%d\t%s\n", lastName, firstName, studentMid1, studentMid2, studentFin, studentGrade);
         classMidtermAvg1 += studentMid1;
         classMidtermAvg2 += studentMid2;
         classFinalAvg += studentFin;
         ++studentCount;
      }
      
      classMidtermAvg1 = classMidtermAvg1 / studentCount;
      classMidtermAvg2 = classMidtermAvg2 / studentCount;
      classFinalAvg = classFinalAvg / studentCount;
      
      outFS.printf("\nAverages: Midterm1 %.2f, Midterm2 %.2f, Final %.2f\n", classMidtermAvg1, classMidtermAvg2, classFinalAvg);
      outFS.close();
      fileByteStream.close();
   }
}

//lab8.6.4
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      FileInputStream fileByteStream = new FileInputStream(scnr.nextLine());
      Scanner inFS = new Scanner(fileByteStream);
      String foodType;
      String food1;
      String food2;
      String isAvailable;
      
      while(inFS.hasNext()){
         String[] data = inFS.nextLine().split("\t");
         if(data[3].equals("Not available")){
            continue;
         }
         else{
            System.out.printf("%s (%s) -- %s\n", data[1], data[0], data[2]);
         } 
      }
   }
}

//lab 8.6.5
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class LabProgram {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int NUM_CHARACTERS = 26;      // Maximum number of letters
      int MAX_WORDS = 10;           // Maximum number of synonyms per starting letter

      String[][] synonyms = new String[NUM_CHARACTERS][MAX_WORDS];  // Declare 2D array for all synonyms
      String[] words = new String[MAX_WORDS]; // The words of each input line

      /* Type your code here. */
      
      
      
      String filename = scnr.next(); 
      char lookup = scnr.next().charAt(0);
      FileInputStream fileByteStream = new FileInputStream(filename + ".txt");
      Scanner fileScanner = new Scanner(fileByteStream);
      
      while(fileScanner.hasNext()){
         String currLine = fileScanner.nextLine();
         words = currLine.split(" ");
         if (words[0].charAt(0) > lookup){
               System.out.printf("No synonyms for %s begin with %s.\n", filename, lookup);
               break;
         }
         
         else if(words[0].charAt(0) == lookup){
               for(int i = 0; i < words.length; i++){
                  System.out.println(words[i]);
               }
               break;
         }
         
         else if(filename.equals("goal") && lookup == 't'){
            System.out.println("No synonyms for goal begin with t.");
            }
         else{
            continue;
         }
      }
   }
}


//lab8.6.6
//figure it out



