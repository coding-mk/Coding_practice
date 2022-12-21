/*
Problem Description
Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
See example for clarifications over the pattern.

Problem Constraints
1 <= N <= 1000

Input Format
First line is an integer N

Output Format
N lines conatining only char '*' as per the question.

Example Input
Input 1:
4
Input 2:
6

Example Output
Output 1:
********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:
************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
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
        int n = scan.nextInt();
        for(int i=n;i>=1;i--) {
			for(int j=0;j<n;j++) {
				if(j<i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			for(int k=n;k>=1;k--) {
				if(k<=i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
		for(int i=n;i>=1;i--) {
			for(int k=n;k>=1;k--) {
				if(k>=i) {
					System.out.print('*');
				}else {
					System.out.print(" ");
				}
			}
			for(int j=1;j<=n;j++) {
				if(j<i) {
					System.out.print(" ");
				}else {
					System.out.print('*');
				}
			}
			System.out.println("");
		}
    }
}
