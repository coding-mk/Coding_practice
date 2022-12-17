/*
Problem Description
Given a number A. Return square root of the number if it is perfect square otherwise return -1.

Problem Constraints
1 <= A <= 108

Input Format
First and the only argument is an integer A.

Output Format
Return an integer which is the square root of A if A is perfect square otherwise return -1.
*/

public class Solution {
    public int solve(int A) {
        for(int i=1;i<=A;i++){
            if(i*i==A){
                return(i);
            }
        }
        return(-1);
    }
}
