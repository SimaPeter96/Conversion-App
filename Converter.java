/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.converter;
import java.util.Scanner;

/**
 *
 * @author Simamnkele Peter
 */
public class Converter {

    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       
       double a;
       int b;
       double c;
       
       System.out.println("Enter a number to convert");
       a = input.nextDouble();
       
        System.out.println("Convert");
        System.out.println("1. Inches to Centimeters");
        System.out.println("2. Feet to Centimeters");
        System.out.println("3. Yards to Meters");
        System.out.println("4. Miles to Kilometers");
        
       b = input.nextInt();
       
       if (b == 1)
       {
           c = a *2.54;
           System.out.println(a + " inches equals " + c + " centimeters. ");
       }
        
       else if  (b == 2)
       {
           c = a * 30;
           System.out.println(a + " feet equals " + c + "centimeters.");
       }
       
       else if (b == 3)
       {
           c = a * 0.91;
           System.out.println(a + "yards equals " + c + " meters. ");
       }
      
       else
       {
           c = b * 1.6;
           System.out.println(a + " miles equals " + c + "kilometers.");
       }
    }
}
