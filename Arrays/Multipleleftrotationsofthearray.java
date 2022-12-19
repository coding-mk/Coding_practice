/*
Problem Description
Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.

Problem Constraints
1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000

Input Format
The first argument given is the integer array A.
The second argument given is the integer array B.

Output Format
Return the resultant matrix.
*/

public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> lst = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> arr; 
        ArrayList<Integer> arr1;
        for(int i=0;i<B.size();i++){
            arr1 = new ArrayList<Integer>(A);
            arr = new ArrayList<Integer>(rotateLeft(arr1,B.get(i)));
            lst.add(arr);
        }
        return(lst);
    }

    public ArrayList<Integer> rotateLeft(ArrayList<Integer> A,int B){
        int N=A.size();
        int numRotate = B%N;
        A = revereArray(A,0,N-1);
        A = revereArray(A,0,N-1-numRotate);
        A = revereArray(A,N-numRotate,N-1);
        return(A);
    }

    public ArrayList<Integer> revereArray(ArrayList<Integer> A,int i,int j){
        int c=0;
        while(i<=j){
            c=A.get(i);
            A.set(i,A.get(j));
            A.set(j,c);
            i+=1;
            j-=1;
        }
        return(A);
    }
}
