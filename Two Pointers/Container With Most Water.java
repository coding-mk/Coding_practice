/*
Problem Description
Given n non-negative integers A[0], A[1], ..., A[n-1] , where each represents a point at coordinate (i, A[i]).
N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).
Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Note: You may not slant the container.

Problem Constraints
0 <= N <= 105
1 <= A[i] <= 105

Input Format
Single Argument representing a 1-D array A.

Output Format
Return single Integer denoting the maximum area you can obtain.

Example Input
Input 1:
A = [1, 5, 4, 3]
Input 2:
A = [1]

Example Output
Output 1:
 6
Output 2:
 0

Example Explanation
Explanation 1:

5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3. 
So total area = 3 * 2 = 6
Explanation 2:
No container is formed.
*/
public class Solution {
    public int maxArea(ArrayList<Integer> A) {
        if (A == null)
	        return 0;
	    
	    int n = A.size();
	    int first = 0;
	    int last = n - 1;
	    int area = 0;
	    
	    
	    while (first < last) {
	        int width = last - first;
	        area = Math.max(area, Math.min(A.get(first), A.get(last)) * width);
	        if (A.get(first).intValue() >= A.get(last).intValue())
	            last--;
	        else
	            first++;
	    }
	    
	    return area;
    }
}
