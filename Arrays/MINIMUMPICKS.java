/*
Problem Description
You are given an array of integers A of size N.
Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.

Problem Constraints
2 <= N <= 1e5
-1e9 <= A[i] <= 1e9
There is atleast 1 odd and 1 even number in A

Input Format
The first argument given is the integer array, A.

Output Format
Return maximum among all even numbers of A - minimum among all odd numbers in A.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i: A){
            if(i%2==0){
                if(max<i){
                    max=i;
                }
            }else{
                if(min>i){
                    min=i;
                }
            }
        }
        return(max-min);
    }
}
