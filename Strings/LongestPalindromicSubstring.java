/*
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).

Problem Constraints
1 <= N <= 6000

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the longest palindromic substring of string A.

Example Input
A = "aaaabaaa"

Example Output
"aaabaaa"

Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
*/
public class Solution {
    public String longestPalindrome(String A) {
        int newans=1,ans=1,N=A.length(),index=0;
        for(int i=0;i<N;i++){
            newans=Math.max(ans,expand(A,i,i));
            if(newans>ans){
                index = i-newans/2;
            }
            ans=newans;
        }

        for(int i=0;i<N-1;i++){
            newans=Math.max(ans,expand(A,i,i+1));
            if(newans>ans){
                index = i+1-(newans/2);
            }
            ans=newans;
        }

        String newStr="";
        for(int i=index;i<index+newans;i++){
            newStr = newStr + A.charAt(i);
        }
        return(newStr);

    }

    public int expand(String str,int p1,int p2){
        int N=str.length();
        while(p1>=0 && p2<N && str.charAt(p1) == str.charAt(p2)){
            p1-=1;
            p2+=1;
        }
        return(p2-p1-1);
    }
}
