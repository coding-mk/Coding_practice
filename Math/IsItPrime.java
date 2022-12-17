/*
Problem Description
Take an integer A as input, you have to tell whether it is a prime number or not.
A prime number is a natural number greater than 1 which is divisible only by 1 and itself.

Problem Constraints
1 <= A <= 106

Input Format
First and only line of the input contains a single integer A.

Output Format
Print YES if A is a prime, else print NO.*/

import java.util.Scanner;
public class IsItPrime {

	public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
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
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        scan.close();
    }
}
