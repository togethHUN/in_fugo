/*
* File: Sol.java
* Author: Tóth Gergely
* Copyright: 2026, Tóth Gergely
* Group: Szoft I/N
* Date: 2026-03-02
* Github: https://github.com//
* Licenc: MIT
*/


package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sol {

    public static void task01() {

        Scanner sc = new Scanner(System.in);
        List<String> targeList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            
            String target = sc.nextLine();
            targeList.add(target);

        }
        sc.close();
    }


    public static void printTarget(ArrayList<String> targetList) {

        
        for (int i = 0; i < targetList.size(); i++) {
    
            System.out.println(targetList.get(i));
                
        }
        

    }
    
}
