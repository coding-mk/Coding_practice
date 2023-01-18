/*
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).

Problem Constraints
1 <= length of A <= 105
1 <= length of B <= 105
A and B are binary strings

Input Format
The two argument A and B are binary strings.

Output Format
Return a binary string denoting the sum of A and B

Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"

Example Output
Output 1:
"111"
Output 2:
"1000"

Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2: 
The sum of 110 and 10 is 1000.
*/

public class Solution {
    public String addBinary(String A, String B) {
    String result = "";
    int temp = 0;
    int size_a = A.length() - 1;
    int size_b = B.length() - 1;
    while (size_a >= 0 || size_b >= 0 || temp == 1){
        temp += ((size_a >= 0)? A.charAt(size_a) - '0': 0);
        temp += ((size_b >= 0)? B.charAt(size_b) - '0': 0);
        result = (char)(temp % 2 + '0') + result;
        temp /= 2;
        size_a--; 
        size_b--;
   }
        return(result);
    }
}
