/*
Problem Description
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input Format
The only argument given is string A.
Output Format
Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3
Input 2:
    A = "111011101"
Output 2:
    7
*/

public class Solution {
    public int solve(String A) {
        int maxConsecutiveOne = 0;
        int start = 0, k=1,zeroCount =0;
        for(int end=0;end<A.length();end++){
            if(A.charAt(end)=='0'){
                zeroCount++;
            }
            while(zeroCount > k){
                if(A.charAt(start) == '0'){
                    zeroCount--;
                }
                start++;
            }
            maxConsecutiveOne = Math.max(maxConsecutiveOne, end-start);
        }

        return(maxConsecutiveOne);
    }
}
