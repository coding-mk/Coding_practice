/*
Problem Description
Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of the maximum value of the array
and at least one occurrence of the minimum value of the array.

Problem Constraints
1 <= |A| <= 2000

Input Format
First and only argument is vector A

Output Format
Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array

Example Input
Input 1:
A = [1, 3]
Input 2:
A = [2]

Example Output
Output 1:
 2
Output 2:
 1

Example Explanation
Explanation 1:
 Only choice is to take both elements.
Explanation 2:
 Take the whole array.
*/
public class Solution {
    public int solve(ArrayList<Integer> A) {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            if(max<A.get(i)){
                max=A.get(i);
            }
            if(min>A.get(i)){
                min=A.get(i);
            }
        }
        int N=A.size(),ans=A.size(),maxI=-1,minI=-1,l=0;
        for(int i=N-1;i>=0;i--){
            if(A.get(i)==min){
                minI=i;
                if(maxI!=-1){
                    l=Math.abs(minI-maxI)+1;
                    ans=Math.min(ans,l);
                }
            }
            if(A.get(i)==max){
                maxI=i;
                if(minI!=-1){
                    l=Math.abs(minI-maxI)+1;
                    ans=Math.min(ans,l);
                }
            }
        }
        return(ans);
    }
}
