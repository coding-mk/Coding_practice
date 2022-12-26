/*
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is integer A

Output Format
Return a 2-D matrix which consists of the elements added in spiral order.

Example Input
Input 1:

1
Input 2:

2

Example Output
Output 1:
[ [1] ]
Output 2:
[ [1, 2], [4, 3] ]

Example Explanation
Explanation 1:

Only 1 is to be arranged.
Explanation 2:

1 --> 2
      |
      |
4<--- 3
*/

public class Solution {
    public int[][] generateMatrix(int A) {
        int[][] arr = new int[A][A];
        int K=1,L=0,T=0,R=A-1,B=A-1;
        while(K<=A*A){
            for(int i=L;i<=R;i++){
                arr[T][i]=K;
                K+=1;
            }
            T+=1;
            for(int i=T;i<=B;i++){
                arr[i][R]=K;
                K+=1;
            }
            R-=1;
            for(int i=R;i>=L;i--){
                arr[B][i]=K;
                K+=1;
            }
            B-=1;
            for(int i=B;i>=T;i--){
                arr[i][L]=K;
                K+=1;
            }
            L+=1;
        }
        return(arr);
    }
}
