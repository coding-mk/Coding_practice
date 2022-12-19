/*

Problem Description
Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.

Problem Constraints
1 <= N <= 106
1 <= A[i] <=108
1 <= B <= 109

Input Format
There are 2 lines in the input

Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.
Line 2: A single integer B.

Output Format
Print array A after rotating it B times towards the right.
*/

// Solution 1
import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        int rotate = scan.nextInt();
        String[] arr = inputString.split(" ");
        int len = Integer.parseInt(arr[0]);
        int rot = rotate%len;
        int start = len+1-rot;
        int arr1[] = new int[len];
        int j=0;
        for(int i=start;i<=len;i++){
            arr1[j]=Integer.parseInt(arr[i]);
            j+=1;
        }
        int k=1,end=j;
        while(j<len){
            arr1[j]=Integer.parseInt(arr[k]);
            k+=1;
            j+=1;
        }
        for(int z=0;z<len;z++){
            System.out.print(arr1[z]+ " ");
        }
    }
}

// Solution2
public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        int rotate = scan.nextInt();
        String[] arr = inputString.split(" ");
        int len = Integer.parseInt(arr[0]);
        rotate = rotate%len;
        int i=1,j=len;
        String temp="";
        while(i<=j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=1;
        j=rotate;
        while(i<=j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i=rotate+1;
        j=len;
        while(i<=j){
            temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int t=1;t<=len;t++){
            System.out.print(arr[t] + " ");
        }
    }
}
