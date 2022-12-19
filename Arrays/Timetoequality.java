/*
Problem Description
Given an integer array A of size N. In one second, you can increase the value of one element by 1.
Find the minimum time in seconds to make all elements of the array equal.

Problem Constraints
1 <= N <= 1000000
1 <= A[i] <= 1000

Input Format
First argument is an integer array A.

Output Format
Return an integer denoting the minimum time to make all elements equal.

Example Input
A = [2, 4, 1, 3, 2]

Example Output
8

Example Explanation
We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
*/

public class Solution {
    public int solve(ArrayList<Integer> A) {
        int N=A.size();
        ArrayList<Integer> pfix=new ArrayList<Integer>();
        int max =A.get(0);
        pfix.add(A.get(0));
        for(int i=1;i<N;i++){
            pfix.add(pfix.get(i-1)+A.get(i));
            if(max<A.get(i)){
                max=A.get(i);
            }
        }
        int time=0,mul=0;
        mul=max*N;
        time=mul-pfix.get(N-1);
        return(time);
    }
}
