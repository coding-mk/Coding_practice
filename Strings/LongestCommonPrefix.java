/*
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".

Problem Constraints
0 <= sum of length of all strings <= 1000000

Input Format
The only argument given is an array of strings A.

Output Format
Return the longest common prefix of all strings in A.

Example Input
Input 1:
A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:
A = ["abab", "ab", "abcd"];

Example Output
Output 1:
"a"
Output 2:
"ab"

Example Explanation
Explanation 1:
Longest common prefix of all the strings is "a".
Explanation 2:
Longest common prefix of all the strings is "ab".
*/
public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
        int len = A.size();
        if(len==1){
            return(A.get(0));
        }
        String s=findCommonString(A.get(0),A.get(1));
        for(int i=2;i<len;i++){
            s = findCommonString(s,A.get(i));
        }
        return(s);
    }

    public String findCommonString(String str1, String str2){
        int len1=str1.length(),len2=str2.length();
        int max = len1<len2?len1:len2;
        String S="";
        for(int i=0;i<max;i++){
            if(str1.charAt(i)==str2.charAt(i)){
                S+=str1.charAt(i);
            }else{
                break;
            }
        }
        return(S);
    }
}
