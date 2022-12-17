/*
Problem Description
You are given an integer N you need to print all the Armstrong Numbers between 1 to N. (N inclusive).
If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 ).
Note: All the test cases in this problem are limited to 3 digit numbers.

Problem Constraints
1 <= N <= 500

Input Format
First and only line of input contains an integer N.

Output Format
Output all the Armstrong numbers in range [1,N] each in a new line.
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
        int rang = scan.nextInt();
        int rem=0,sum=0,num=0,pow=0;
        if(rang > 1){
            System.out.println(1);
            for(int i=150;i<=rang;i++){
                num=i;
                sum=0;
                while(num>0){
                    rem = num%10;
                    pow = rem*rem*rem;
                    sum+=pow;
                    num=num/10;
                }
                if(sum==i){
                    System.out.println(i);
                }
            }  
        }else{
            System.out.println(1);
        }
    }
}
