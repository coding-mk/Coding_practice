/*
Problem Description
Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.

Problem Constraints
1 <= |A| <= 105
1 <= A[i] <= 109

Input Format
The first argument of input contains an integer array, A.
The second argument of input contains an integer, B.

Output Format
Return an integer representing the answer.
*/

public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int max = B,c=0,flag=0;;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max){
                c+=1;
            }
            if(A.get(i)==max){
                flag+=1;
            }
        }
        if(c==0 || flag == 0){
            return(-1);
        }else{
            return(c);
        }
    }
}
