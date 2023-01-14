/*
Problem Description
Given a matrix of integers A of size N x M consisting of 0 or 1.
For each cell of the matrix find the distance of nearest 1 in the matrix.
Distance between two cells (x1, y1) and (x2, y2) is defined as |x1 - x2| + |y1 - y2|.
Find and return a matrix B of size N x M which defines for each cell in A distance of nearest 1 in the matrix A.
NOTE: There is atleast one 1 is present in the matrix.

Problem Constraints
1 <= N, M <= 1000
0 <= A[i][j] <= 1

Input Format
The first argument given is the integer matrix A.

Output Format
Return the matrix B.

Example Input
Input 1:
 A = [
       [0, 0, 0, 1]
       [0, 0, 1, 1] 
       [0, 1, 1, 0]
     ]
Input 2:
 A = [
       [1, 0, 0]
       [0, 0, 0]
       [0, 0, 0]  
     ]
Example Output
Output 1:
 [ 
   [3, 2, 1, 0]
   [2, 1, 0, 0]
   [1, 0, 0, 1]   
 ]
Output 2
 [
   [0, 1, 2]
   [1, 2, 3]
   [2, 3, 4] 
 ]

Example Explanation
Explanation 1:
 A[0][0], A[0][1], A[0][2] will be nearest to A[0][3].
 A[1][0], A[1][1] will be nearest to A[1][2].
 A[2][0] will be nearest to A[2][1] and A[2][3] will be nearest to A[2][2].
Explanation 2:
 There is only a single 1. Fill the distance from that 1.
*/

public class Solution {
    int[][] visit;
	int[][] ans;
	Queue<Integer> que;
    public int[][] solve(int[][] A) {
        int N=A.length,M=A[0].length;
		visit = new int[N][M];
		ans = new int[N][M];
		que = new LinkedList<Integer>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				if(A[i][j]==1) {
					que.add(i);
					que.add(j);
					ans[i][j]=0;
				}else {
					ans[i][j]=-1;
				}
				
			}
		}
		int u,v;
		while(!que.isEmpty()) {
			u=que.poll();
			v=que.poll();
			if(visit[u][v]!=1) {
				visit[u][v]=1;
				dfs(ans[u][v],u-1,v);
				dfs(ans[u][v],u,v+1);
				dfs(ans[u][v],u+1,v);
				dfs(ans[u][v],u,v-1);
			}
		}
		return ans;
    }

    public void dfs(int val,int r, int c) {
		int N=ans.length,M=ans[0].length;
		if(r< 0 || c < 0 || r>= N || c>= M || ans[r][c]==0 || visit[r][c]==1) {
			return;
		}
		que.add(r);
		que.add(c);
		if(ans[r][c] == -1) {
			ans[r][c]=val+1;
		}
	}
}
