/*
Problem Description
Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

Problem Constraints
1<= N <= 1000
1<= A[i][j] <= 1e9

Input Format
Only argument is a 2D array A of size N * N.

Output Format
Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.

Example Input
Input 1:
1 2 3
4 5 6
7 8 9
Input 2:
1 2
3 4

Example Output
Output 1:
1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
Output 2:
1 0
2 3
4 0

Example Explanation
For input 1:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
For input 2:
The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> row;
        ArrayList<ArrayList<Integer>> B=new ArrayList<ArrayList<Integer>>();
        int x=0,y=0;
        int col=A.get(0).size();
		for(int j=0;j<A.get(0).size();j++) {
            row= new ArrayList();
			x=0;
			y=j;
			while(x<A.size() && y>=0) {
                row.add(A.get(x).get(y));
				x++;
				y--;
			}
            while(x<col){
                row.add(0);
                x++;
            }
            B.add(row);
		}
		for(int i=1;i<A.size();i++) {
			x=i;
			y=A.get(0).size()-1;
            row= new ArrayList();
			while(x<A.size() && y>=0) {
                row.add(A.get(x).get(y));
				x++;
				y--;
			}
            while(0<=y){
                row.add(0);
                y--;
            }
            B.add(row);
		}
        return(B);
    }
}
