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
        Scanner input = new Scanner(System.in)
        
        while (true) {
            System.out.println("Enter your age");
            int age = input.nextInt();

            switch (age) {
                case 1:
                    System.out.println("child");
                    break;
                case 20:
                    System.out.println("Allow");
                    break;
                case 40:
                    System.out.println("Denied");
                    break;
                default:
                    System.exit(0);
            }
        }

    }
}