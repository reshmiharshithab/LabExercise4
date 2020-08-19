/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Year2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class YeariiMarks {
    public void display() {
       
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter subject 3 marks:");
        int sub3marks=obj.nextInt();
        if(sub3marks>=50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
        System.out.println("Enter subject 4 marks:");
        int sub4marks=obj.nextInt();
        if(sub4marks>=50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    
}
    
}
