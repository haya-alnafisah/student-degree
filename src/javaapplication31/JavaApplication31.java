/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication31;

import java.util.Scanner;

/**
 *
 * @author win
 */
public class JavaApplication31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int degree;
    Scanner input= new Scanner (System.in);
    System.out.println("Enter student degree");
    degree=input.nextInt();
    if(degree>=60)
        System.out.println("pass");
    else
        System.out.println("fail");
    }
    
}
