/*
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.

Problem Constraints
1 <= |A| <= 105
String A consist only of lowercase characters.

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the reversed string.

Example Input
Input 1:
 A = "scaler"
Input 2:
 A = "academy"

Example Output
Output 1:
 "relacs"
Output 2:
 "ymedaca"

Example Explanation
Explanation 1:
 Reverse the given string.
*/
public class Solution {
    public String solve(String A) {
        char ch[] = A.toCharArray();
        char temp;
        int x=0,y=ch.length-1;
        while(x<y){
            temp = ch[x];
            ch[x]=ch[y];
            ch[y]=temp;
            x+=1;
            y-=1;
        }
        String s1 = new String(ch);
        return(s1);
    }
}
