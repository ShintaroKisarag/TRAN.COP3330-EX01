/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Phi-Hung Tran
 */

import java.util.Scanner;

class ex01 {
    public static void main(String[] args){
        Scanner question = new Scanner(System.in); //scans input
        System.out.println("What is your name?");

        String name = question.nextLine();  //stores input
        System.out.println("Hello," + name + ",nice to meet you!");
    }
}
