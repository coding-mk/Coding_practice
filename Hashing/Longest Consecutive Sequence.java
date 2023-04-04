/*
Problem Description
Given an unsorted integer array A of size N.

Find the length of the longest set of consecutive elements from array A.



Problem Constraints
1 <= N <= 106

-106 <= A[i] <= 106



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the length of the longest set of consecutive elements from the array A.



Example Input
Input 1:

A = [100, 4, 200, 1, 3, 2]
Input 2:

A = [2, 1]


Example Output
Output 1:

 4
Output 2:

 2


Example Explanation
Explanation 1:

 The set of consecutive elements will be [1, 2, 3, 4].
Explanation 2:

 The set of consecutive elements will be [1, 2].
*/
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int longestConsecutive(final List<Integer> A) {
        HashSet<Integer> map = new HashSet<Integer>();
        if(A.size()==1){
            return(1);
        }
        for(int i=0;i<A.size();i++){
            map.add(A.get(i));
        }

        int count=0;
        for(int i=0;i<A.size();i++){
            if(!map.contains(A.get(i)-1)){
                int j = A.get(i);
                while (map.contains(j)){
                    j++;
                }
 
                // update  optimal length if this
                // length is more
                if (count < j - A.get(i)){
                    count = j - A.get(i);
                }
                   
            }
        }
        return(count);
    }
}
