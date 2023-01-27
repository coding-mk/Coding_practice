/*
Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.

Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109

Input Format
The first argument is an array of integers.

Output Format
Return a string representing the largest number.

Example Input
Input 1:
 A = [3, 30, 34, 5, 9]
Input 2:
 A = [2, 3, 9, 0]

Example Output
Output 1:
 "9534330"
Output 2:
 "9320"

Example Explanation
Explanation 1:
Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:
Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public String largestNumber(final List<Integer> A) {
        String[] arr = new String[A.size()];
        for(int i=0;i<A.size();i++){
            arr[i] = String.valueOf(A.get(i));
        }
        
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(String s: arr){
            sb.append(s);
        }
        
        if(sb.charAt(0)=='0'){
            return String.valueOf(0);
        }
        
        return sb.toString();
    }
}
