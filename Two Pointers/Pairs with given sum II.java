/*
Problem Description
Given a sorted array of integers (not necessarily distinct) A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.
Since the number of such pairs can be very large, return number of such pairs modulo (109 + 7).

Problem Constraints
1 <= |A| <= 100000
1 <= A[i] <= 10^9
1 <= B <= 10^9

Input Format
The first argument given is the integer array A.
The second argument given is integer B.

Output Format
Return the number of pairs for which sum is equal to B modulo (10^9+7).

Example Input
Input 1:
A = [1, 1, 1]
B = 2
Input 2:
A = [1, 1]
B = 2

Example Output
Output 1:
 3
Output 2:
 1

Example Explanation
Explanation 1:
 Any two pairs sum up to 2.
Explanation 2:
 only pair (1, 2) sums up to 2.
*/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int count=0,i=0,j=A.size()-1,mod=1000000007;
        while(i<j){
            if(A.get(i)+A.get(j)<B){
                i++;
            }else if(A.get(i)+A.get(j)>B){
                j--;
            }else{
                int n1 = A.get(i);
                int n2 = A.get(j);
                if(n1 == n2){
                    long x = ((long)j-(long)i+(long)1);
                    count = count + (int)(((x*(x-1))/2) % mod);
                    break;
                }else{
                    int a=0,b=0,num=0;
                    num = A.get(i);
                    while(A.get(i)==num){
                        a++;
                        i++;
                    }
                    num=A.get(j);
                    while(A.get(j)==num){
                        j--;
                        b++;
                    }
                    count+= (a*b)%mod;
                }
            }
        }
        return(count%mod);
    }
}
