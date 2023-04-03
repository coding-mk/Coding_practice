/*
Problem Description
Given an array A of N integers, are there elements a, b, c in S such that a + b + c = 0
Find all unique triplets in the array which gives the sum of zero.

Note:
Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c) The solution set must not contain duplicate triplets.

Problem Constraints
0 <= N <= 7000
-108 <= A[i] <= 108

Input Format
Single argument representing a 1-D array A.

Output Format
Output a 2-D vector where each row represent a unique triplet.

Example Input
A = [-1,0,1,2,-1,4]

Example Output
[ [-1,0,1],
  [-1,-1,2] ]

Example Explanation
Out of all the possible triplets having total sum zero,only the above two triplets are unique.
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
	    ArrayList<Integer> temp = new ArrayList<>();
	    
	    if (A == null)
	        return res;
	    
	    Collections.sort(A);
	    int n = A.size();
	    
	    for (int low = 0; low < n - 2; low++) {
	        
	        int mid = low + 1;
	        int high = n - 1;
	        int sum = -A.get(low);
	        
	        if (low > 0 && A.get(low).intValue() == A.get(low - 1).intValue())
	            continue;
	        
	        while (mid < high) {
	            
	            int num = A.get(mid) + A.get(high);
	            
	            if (num == sum) {
	                temp.add(A.get(low));
	                temp.add(A.get(mid));
	                temp.add(A.get(high));
	                res.add(new ArrayList(temp));
	                temp.clear();
	                
	                int prev = mid;
	                while (mid <= high && A.get(mid).intValue() == A.get(prev).intValue())
	                    mid++;
	                    
	            } else if (num < sum) {
	                mid++;
	            } else {
	                high--;
	            }
	        }
	    }
	    
	    return res;
    }
}
