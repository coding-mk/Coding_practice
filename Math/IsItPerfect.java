/*
Problem Description
Take T (number of test cases) as input.
For each test case, take integer N as input, you have to tell whether it is a perfect number or not.
A perfect number is a positive integer that is equal to the sum of its proper positive divisors (excluding the number itself). A positive proper divisor divides a number without leaving any remainder.

Problem Constraints
1 <= T <= 10
1 <= N <= 106

Input Format
The first line of the input contains a single integer T.
Each of the next T lines contains a single integer N.

Output Format
In a separate line, print YES if a given integer is perfect, else print NO.
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
        int N = scan.nextInt();
        List<Integer> lst=new ArrayList<Integer>();
        int A=0; 
        for(int i=0;i<N;i++){
            A = scan.nextInt();
            lst.add(A);
        }
        int sum=0;
        for(int I : lst){
            if(checkForPrime(I) == 1){
                System.out.println("NO");
            }else{
                sum=0;
                for(int j=1;j<=I/2;j++){
                    if(I%j==0){
                        sum+=j;
                    }
                }
                if(sum==I){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        
    }

    public static int checkForPrime(int num){
        int count=0;
        for(int i=1;i*i<=num;i++){
            if(num%i==0){
                if(i == num/i){
                    count+=1;
                }else{
                    count+=2;
                }
            }
        } 
        if(count==2){
            return(1);
        }else{
            return(2);
        }
    }
}
