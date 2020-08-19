/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;
import Year1.*;
import Year2.*;
import java.util.Scanner;



/**
 *
 * @author user
 */
public class Student {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner obj = new Scanner(System.in);
          System.out.println("Enter the number of students:");
          int n = obj.nextInt();
          for(int i=0;i<n;i++)
          {
              System.out.println("Enter the name of student "+(i+1));
              String name = obj.next();
              System.out.println("Enter the roll number of student "+(i+1));
              int r =obj.nextInt();
              Year1.YeariMarks m1 = new Year1.YeariMarks();
              m1.display();
              Year2.YeariiMarks m2 = new Year2.YeariiMarks();
              m2.display();
    }
    
}
}
