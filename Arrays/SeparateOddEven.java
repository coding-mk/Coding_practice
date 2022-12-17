/*
Problem Description
You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
You have to print the odd and even elements of array A in 2 separate lines.
NOTE: Array elements should have the same relative order as in A.

Problem Constraints
1 <= T <= 10
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
First line of the input contains a single integer T.
For each test case:
First line consists of a single integer |A| denoting the length of array.
Second line consists of |A| space separated integers denoting the elements of array A.

Output Format
For each test case:
First line should contain an array of space separated integers containing all the odd elements of array A
Second line should contain an array of space separated integers containing all the even elements of array A
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
        int T = scan.nextInt();
        int N=0,num=0;
        for(int i=0;i<T;i++){
            List<Integer> even=new ArrayList<Integer>();
            N=scan.nextInt();
            for(int j=0;j<N;j++){
                num=scan.nextInt();
                if(num%2==0){
                    even.add(num);
                }else{
                    System.out.print(num + " ");
                }
            }
            System.out.println();
            for(int e=0;e<even.size();e++){
                System.out.print(even.get(e)+ " ");
            }
            System.out.println();
        }
    }
}
