/*
Problem Description
Write a program to print maximum and minimum elements of the input array A of size N. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints
1 <= N <= 1000
1 <= A <= 1000

Input Format
The first line contains a single integer N representing the length of the array A followed by N elements of the array A.

Output Format
A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.
*/

import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        int max=0;
        int min=1000;
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] str = s.split(" ");
        int j=0;
        for(int i=1;i<=Integer.parseInt(str[0]);i++){
            j=Integer.parseInt(str[i]);
            if(j>max){
                max=j;
            }
            if(j<min){
                min=j;
            }
        }
        System.out.println(max + " " + min);  
    }
}
