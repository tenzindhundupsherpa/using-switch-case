/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your age");
            int age = input.nextInt();

            if (age <= 12) {
                System.out.println("you are child");
            } else if (age >= 13 && age <= 19) {
                System.out.println("yoe are teen");
            } else if (age >= 20 && age <= 30) {
                System.out.println("you are adult");
            } else {
                System.out.println("you are old");
            }

            System.out.println("Conitnue?[Y?N]");

            String choice = input.next();
            if (choice.equalsIgnoreCase("n")) {
                System.exit(0);
            }

        }

    }
