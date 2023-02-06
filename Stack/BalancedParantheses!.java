/*
Problem Description
Given a string A consisting only of '(' and ')'.
You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.

Problem Constraints
1 <= |A| <= 105

Input Format
First argument is an string A.

Output Format
Return 1 if parantheses in string are balanced else return 0.

Example Input
Input 1:
 A = "(()())"
Input 2:
 A = "(()"

Example Output
Output 1:
 1
Output 2:
 0

Example Explanation
Explanation 1:
 Given string is balanced so we return 1.
Explanation 2:
 Given string is not balanced so we return 0.
*/
public class Solution {
    public int solve(String A) {
        Stack<Character> stk= new Stack<Character>();
        char ch;
        for(int i=0;i<A.length();i++){
            ch=A.charAt(i);
            if(ch=='('){
                stk.push(ch);
            }
            if(ch==')'){
                if(stk.empty()){
                    return(0);
                }else{
                    stk.pop();
                }
            }
        }
        if(stk.empty()){
            return(1);
        }else{
            return(0);
        }
    }
}
