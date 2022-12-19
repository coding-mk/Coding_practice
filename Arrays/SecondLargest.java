/*
Problem Description
You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.

Problem Constraints
1 <= |A| <= 105
0 <= A[i] <= 109

Input Format
The first argument is an integer array A.

Output Format
Return the second largest element. If no such element exist then return -1.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        if(A.size()>1){
            for(int i=0;i<A.size();i++){
                if(max<=A.get(i)){
                    max2=max;
                    max=A.get(i);
                }else if(max2<A.get(i)){
                    max2=A.get(i);
                }
            }
            return(max2);
        }else{
            return(-1);
        }
    }
}
