/*
Problem Description
Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user

Problem Constraints
1 <= N <= 1000

Input Format
A single line representing N

Output Format
A single integer showing sum of all Natural numbers from 1 to N
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum=0;
        sum = (num*(num+1))/2;
        System.out.println(sum);
        
    }
}
