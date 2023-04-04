/*
Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.

If the given array contains a sub-array with sum zero return 1, else return 0.



Problem Constraints
1 <= |A| <= 100000

-10^9 <= A[i] <= 10^9



Input Format
The only argument given is the integer array A.



Output Format
Return whether the given array contains a subarray with a sum equal to 0.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
Input 2:

 A = [-1, 1]


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No subarray has sum 0.
Explanation 2:

 The array has sum 0.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        if(A.size()==1 && A.get(0)!=0){
            return(0);
        }
        if(A.size()==1 && A.get(0)==0){
            return(1);
        }

        ArrayList<Integer> pf=new ArrayList<Integer>();
        pf.add(A.get(0));
        for(int i=1;i<A.size();i++){
            if(A.get(i)==0){
                return(1);
            }
            pf.add(pf.get(i-1)+A.get(i));
            if(pf.get(i)==0){
                return(1);
            }
        }
        HashSet<Integer> map=new HashSet<Integer>();
        for(int i=0;i<pf.size();i++){
            if(map.contains(pf.get(i))){
                return(1);
            }else{
                map.add(pf.get(i));
            }
        }
        return(0);
    }
}
