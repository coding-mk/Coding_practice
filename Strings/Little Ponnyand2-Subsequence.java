/*
Problem Description

Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?
A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".

Problem Constraints
1 <= |A| <= 105
A only contains lowercase alphabets.

Input Format
The first and the only argument of input contains the string, A.

Output Format
Return a string representing the answer.

Example Input
Input 1:
 A = "abcdsfhjagj" 
Input 2:
 A = "ksdjgha" 

Example Output
Output 1:
 "aa" 
Output 2:
 "da" 

Example Explanation
Explanation 1:
 "aa" is the lexicographically minimum subsequence from A. 
Explanation 2:
 "da" is the lexicographically minimum subsequence from A.
*/
public class Solution {
    public String solve(String A) {
        int min = 'z'+1,index=-1,value=0;
        for(int i=0;i<A.length()-1;i++){
            value = A.charAt(i);
            if(min>value){
                min=value;
                index=i;
            }
        } 
        String s = "";
        s = s + A.charAt(index);
        min = 'z'+1; 
        for(int i=index+1;i<A.length();i++){
             value = A.charAt(i);
            if(min>value){
                min=value;
                index=i;
            }
        }
        s = s + A.charAt(index);
        return(s);
        
    }
}
