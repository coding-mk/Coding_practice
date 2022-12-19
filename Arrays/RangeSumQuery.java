/*
Problem Description
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.

Problem Constraints
1 <= N, M <= 105
1 <= A[i] <= 109
1 <= L <= R <= N

Input Format
The first argument is the integer array A.
The second argument is the 2D integer array B.

Output Format
Return an integer array of length M where ith element is the answer for ith query in B.
*/

public class Solution {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> prefix = new ArrayList<Long>();
        prefix.add((long)A.get(0));
        long num=0;
        for(int i=1;i<A.size();i++){
            num=prefix.get(i-1)+A.get(i);
            prefix.add(num);
        }
        ArrayList<Long> ansLst=new ArrayList<Long>();
        long ans=0;
        int R=0,L=0;
        for(int j=0;j<B.size();j++){
            L=B.get(j).get(0)-1;
            R=B.get(j).get(1)-1;
            if(L==0){
                ans=prefix.get(R).longValue();
            }else{
                ans=prefix.get(R).longValue()-prefix.get(L-1).longValue();
            }
            ansLst.add(ans);
        }
        return(ansLst);
    }
}
