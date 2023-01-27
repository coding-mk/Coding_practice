/*
Problem Description
Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
Concatenate the string with itself.
Delete all the uppercase letters.
Replace each vowel with '#'.
You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.

Problem Constraints
1<=N<=100000

Input Format
First argument is a string A of size N.

Output Format
Return the resultant string.

Example Input
A="AbcaZeoB"

Example Output
"bc###bc###"

Example Explanation
First concatenate the string with itself so string A becomes "AbcaZeoBAbcaZeoB".
Delete all the uppercase letters so string A becomes "bcaeobcaeo".
Now replace vowel with '#'.
A becomes "bc###bc###".
*/
public class Solution {
    public String solve(String A) {
        int c=0;
        char ch;
        StringBuilder str = new StringBuilder();
        for(int i=0;i<A.length();i++){
            c=A.charAt(i);
            ch=A.charAt(i);
            if(c>=97 && c<=122){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    str.append('#');
                }else{
                    str.append(ch);
                }
            }
        }
        str.append(str);
        String S=new String(str);
        return(S);
    }
}
