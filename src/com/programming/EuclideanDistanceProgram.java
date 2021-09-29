package com.programming;

import java.util.Scanner;

public class EuclideanDistanceProgram {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value for x ");
        int X = sc.nextInt();
        System.out.println("Enter the value for y ");
        int Y = sc.nextInt();

        double distance = Math.sqrt((Math.pow(X,2)+Math.pow(Y,2)));
        System.out.println("The Euclidean distance for the corresponding pts is " + distance);
    }
}
