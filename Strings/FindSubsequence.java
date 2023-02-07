/*
Given two strings A and B, find if A is a subsequence of B.
Return "YES" if A is a subsequence of B, else return "NO".

Input Format
The first argument given is the string A.
The second argument given is the string B.

Output Format
Return "YES" if A is a subsequence of B, else return "NO".

Constraints
1 <= lenght(A), length(B) <= 100000
'a' <= A[i], B[i] <= 'z'

For Example
Input 1:
    A = "bit"
    B = "dfbkjijgbbiihbmmt"

Output 1:
    YES

Input 2:
    A = "apple"
    B = "appel"
Output 2:
    "NO"
*/
public class Solution {
    public String solve(String A, String B) {
        int j=0;
        char ch;
        for(int i=0;i<A.length();i++){
            ch=A.charAt(i);
            j=checkChar(B,ch,j);
            if(j<0){
                return("NO");
            }else{
                j++;
            }
        }
        return("YES");
    }

    public int checkChar(String B, char ch, int j){
        int flag=0;
        int i=j;
        while(i<B.length()){
            if(ch==B.charAt(i)){
                j=i;
                flag=1;
                break;
            }
            i++;
        }
        if(flag==1){
            return(j);
        }else{
            return(-1);
        }
    }
}
