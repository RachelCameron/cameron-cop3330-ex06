/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rachel Cameron
 */

import java.util.Scanner;
import java.util.Calendar;

public class exercise06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your current age?");
        int age = input.nextInt();
        System.out.println("At what age would you like to retire?");
        int retireage = input.nextInt();
        int dif = retireage - age;
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retire = dif + year;
        System.out.printf("You have %d years left until you can retire. \nIt's %d, so you can retire in %d.", dif, year, retire);
    }
}