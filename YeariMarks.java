/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Year1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class YeariMarks {
    public void display() {
       
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        int sub1marks=obj.nextInt();
        if(sub1marks>=50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
        System.out.println("Enter subject 2 marks:");
        int sub2marks=obj.nextInt();
        if(sub2marks>=50)
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
}
}
