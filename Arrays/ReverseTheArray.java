/*
Problem Description
You are given a constant array A.
You are required to return another array which is the reversed form of the input array.

Problem Constraints
1 <= A.size() <= 10000
1 <= A[i] <= 10000

Input Format
First argument is a constant array A.

Output Format
Return an integer array.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> solve(final List<Integer> A) {
        int i=0,j=A.size()-1,c=0;
        while(i<=j){
            c=A.get(i);
            A.set(i,A.get(j));
            A.set(j,c);
            i+=1;
            j-=1;
        }
        ArrayList<Integer> arr = new ArrayList<Integer>(A);
        return(arr);        
    }
}
