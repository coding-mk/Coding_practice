/*
Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.

Problem Constraints
1 <= N <= 5*105
1 <= num[i] <= 109

Input Format
Only argument is an integer array.

Output Format
Return an integer.

Example Input
[2, 1, 2]

Example Output
2

Example Explanation
2 occurs 2 times which is greater than 3/2.
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int m1 =0,c1=0;
		for(int i=0;i<A.size();i++) {
			if(c1==0) {
				m1=A.get(i);
				c1=1;
			}else if(m1==A.get(i)) {
				c1=c1+1;
			}else {
				c1=c1-1;
			}
		}
        int count=0;
		for(int i=0;i<A.size();i++) {
			if(A.get(i)==m1) {
				count+=1;
			}
		}
        int N=A.size()/2;
        if(count>N) {
			return(m1);
		}else {
			return(-1);
		}
    }
}
