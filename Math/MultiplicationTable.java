/*
Problem Description
Take a number A as input, print its multiplication table having the first 10 multiples.

Problem Constraints
1 <= A <= 1000

Input Format
First line contains a single integer A.

Output Format
Print 10 lines, ith line containing ith multiple.
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
        int A=scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(A + " * " + i +" = " + A*i);
        }
    }
}
