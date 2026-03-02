package com.example;

import java.util.Scanner;
public class Solution {
    
    public static void task01() {

        //vizsgaremek céljai (bekérés)
        Scanner sc = new Scanner(System.in);
        String[] targetArray = new String[5];

        for(int i=0; i<5; i++) {
            System.out.print("Cél: ");
            String target = sc.nextLine();
            targetArray[i] = target;



        }

        printTargets(targetArray);
        
        

    }

    public static void printTargets(String[] targetArray) {

        for (int i = 0; i < targetArray.length; i++) {

            System.out.println(targetArray[i]);
            
        }


    }

}

