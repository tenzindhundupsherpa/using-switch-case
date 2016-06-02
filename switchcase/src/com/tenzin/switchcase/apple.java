/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tenzin.switchcase;
import java.util.Scanner;
/**
 *
 * @author Home
 */
public class apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in)
        
        System.out.println("Enter your age");
        int age=input.nextInt();
        
        
        switch(age){
            case 1:
                System.out.println("not valid");
                break;
            case 20:
                System.out.println("invalid");
                break;
            case 21:
                System.out.println("valid");
                break;
            default:
                System.exit(0);
        }
    }
    
}
