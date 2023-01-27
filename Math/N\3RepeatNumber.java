/*
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return any one.

Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109

Input Format
The only argument is an integer array A.

Output Format
Return an integer.

Example Input
[1 2 3 1 1]

Example Output
1

Example Explanation
1 occurs 3 times which is more than 5/3 times.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
        int m1 =0,c1=0,m2=0,c2=0;
		for(int i=0;i<a.size();i++) {
			if(m1==a.get(i)) {
                c1=c1+1;
			}else if(m2==a.get(i)){
                c2=c2+1;
            }else if (c1==0){
				m1=a.get(i);
				c1=1;
			}else if(c2==0){
                m2=a.get(i);
				c2=1;
            }
            else {
				c1=c1-1;
                c2=c2-1;
			}
		}
        int cnt1=0,cnt2=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)==m1) {
				cnt1+=1;
			}
		}
        for(int i=0;i<a.size();i++) {
			if(a.get(i)==m2) {
				cnt2+=1;
			}
		}
        int N=a.size()/3;
        if(cnt1>N) {
			return(m1);
		}else if(cnt2 > N){
            return(m2);
        }
        else {
			return(-1);
		}
	}
}
