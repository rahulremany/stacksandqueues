package com.ibcompsci;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static int[] queueFeeder;
    static Queue queue = new LinkedList();
    public static void main(String[] args) {
        startProgram();
    }
    public static void startProgram(){
        System.out.println("How many numbers would you like to validate?");
        int numbs = scan.nextInt();
        while(numbs<1){
            System.out.println("Try again");
            numbs = scan.nextInt();
        }
        queueFeeder = new int[numbs];
        for(int i = 0; i<queueFeeder.length;i++){
            System.out.println("input next number");
            queueFeeder[i] = scan.nextInt();
        }
        for(int i = 0; i<queueFeeder.length;i++){
            queue.add(queueFeeder[i]);
        }
        runPrime(queue);

    }
    public static void runPrime(Queue queue){

    }
}
