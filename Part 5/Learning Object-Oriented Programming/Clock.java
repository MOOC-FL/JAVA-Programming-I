/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author abdelw
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        // initiliaze three clock hands and give them initial value to zero

        while (true) {
            //infinite and conditional loop

            if (hours < 10) {
                System.out.println("0");
            }
            System.out.print(hours);
            System.out.print(":");
            if (minutes < 10) {
                System.out.println("0");
                //
            }
            System.out.print(minutes);
            System.out.print(":");
            if (seconds < 10) {
                System.out.println("0");
            }
            System.out.print(seconds);
            System.out.print(":");
            // 2. The second hand's progress

            seconds = seconds + 1;
             // 3. The other hand's progress when necessary
            //nested if condition 
            // increase minutes untill it reach 60 
            // increase seconds untill it reach 60
            // increase hours untill it reach 24
            if (seconds > 59) {
                minutes = minutes + 1;
                seconds = 0;
                if (minutes > 59) {
                    hours = hours + 1;
                    minutes = 0;
                    if (hours > 23) {
                        hours = 0;
                    }
                }
            }

        }
    }
}
