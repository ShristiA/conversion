package com.company;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int input = sc.nextInt();

        double result = cmtoinches(input);
        System.out.printf("%.2f" , result);

    }


      public static double cmtoinches(int input){
        double cm = input * 2.54;
        return cm;

    }
}











