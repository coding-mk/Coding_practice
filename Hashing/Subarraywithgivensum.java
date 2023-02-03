/*
Problem Description
Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
If the answer does not exist return an array with a single element "-1".
First sub-array means the sub-array for which starting index in minimum.

Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 109
1 <= B <= 109

Input Format
The first argument given is the integer array A.
The second argument given is integer B.

Output Format
Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single element "-1".

Example Input
Input 1:
 A = [1, 2, 3, 4, 5]
 B = 5
Input 2:
 A = [5, 10, 20, 100, 105]
 B = 110

Example Output
Output 1:
 [2, 3]
Output 2:
 -1

Example Explanation
Explanation 1:
 [2, 3] sums up to 5.
Explanation 2:
 No subarray sums up to required number.
*/
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> C = new ArrayList<Integer>();
        int sum = A.get(0);
		int i=0,j=0;
		while(j<A.size()) {
			if(sum<B) {
				j++;
				if(j<A.size()) {
					sum+=A.get(j);
				}
			}
			if(sum>B) {
				sum-=A.get(i);
				i++;
			}
			if(sum==B) {
				for(int k=i;k<=j;k++) {
					C.add(A.get(k));
				}
				return C;
			}
		}
		C.add(-1);
		return C;
    }
}