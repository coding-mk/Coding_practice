/*
Problem Description
You are given an integer T (number of test cases). You are given array A and an integer B for each test case. You have to tell whether B is present in array A or not.

Problem Constraints
1 <= T <= 10
1 <= A <= 105
1 <= A[i], B <= 109

Input Format
First line of the input contains number of test cases as single integer T .
Next, each of the test case consists of 3 lines:
First line contains a single integer A denoting the length of array
Second line contains A integers denoting the array elements
Third line contains a single integer B

Output Format
For each test case, print on a separate line 1 if the element exists, else print 0.
*/
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan=new Scanner(System.in);
        int test = scan.nextInt();
        String[] s=null;
        String str="";
        String st="";
        int result=0;
        
        for(int i=0;i<test;i++){
            str = scan.nextLine();
            st = scan.nextLine();
            //System.out.println(st);
            s= str.split(" ");
            result = search(s,st);
            System.out.println(result);
        }
        
    }

    public static int search(String[] arr,String st){
        for(int i=1;i<arr.length;i++){
            if(st==arr[i]){
                return(1);
            }
        }
        return(0);
    }
}
