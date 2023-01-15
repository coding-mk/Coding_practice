/*
Problem Description
A country consist of N cities connected by N - 1 roads. King of that country want to construct maximum number of roads such that the new country formed remains bipartite country.
Bipartite country is a country, whose cities can be partitioned into 2 sets in such a way, that for each road (u, v) that belongs to the country, u and v belong to different sets. Also, there should be no multiple roads between two cities and no self loops.
Return the maximum number of roads king can construct. Since the answer could be large return answer % 109 + 7.
NOTE: All cities can be visited from any city.

Problem Constraints
1 <= A <= 105
1 <= B[i][0], B[i][1] <= N

Input Format
First argument is an integer A denoting the number of cities, N.
Second argument is a 2D array B of size (N-1) x 2 denoting the initial roads i.e. there is a road between cities B[i][0] and B[1][1] .

Output Format
Return an integer denoting the maximum number of roads king can construct.

Example Input
Input 1:
 A = 3
 B = [
       [1, 2]
       [1, 3]
     ]
Input 2:
 A = 5
 B = [
       [1, 3]
       [1, 4]
       [3, 2]
       [3, 5]
     ]

Example Output
Output 1:
 0
Output 2:
 2

Example Explanation
Explanation 1:
 We can't construct any new roads such that the country remains bipartite.
Explanation 2:
 We can add two roads between cities (4, 2) and (4, 5).
*/
public class Solution {
    static int[] visited ;
	  static ArrayList < ArrayList < Integer > > adj;
    public int solve(int A, int[][] B) {
        int ans=0;
		int N=A;
		visited = new int[N+1];
		adj = new ArrayList < ArrayList < Integer > > (N+1);
	    for (int i = 0; i < N+1; i++) {
	      visited[i] = 0;
	      adj.add(new ArrayList < Integer > ());
	    }
	    for (int[] edge: B) {
	    	adj.get(edge[0]).add(edge[1]);
		    adj.get(edge[1]).add(edge[0]);
	    }  
	    findRoads(1);
	    long a=0,b=0,mul=0;
	    for(int i=1;i<visited.length;i++) {
	    	if(visited[i]==2) {
	    		a=a + 1;
	    	}else {
	    		b=b + 1;
	    	}
	    }
	    mul = (a*b);
	    long diff = mul - (long)(N-1);
	    ans = (int)(diff%1000000007);
		return ans;
    }

    public static void findRoads(int s) {
		Queue < Integer > q = new ArrayDeque <Integer > ();
	    q.offer(s);
	    visited[s] = 2;
	    while (q.size() > 0) {
		    s = q.poll();
		    for (int v: adj.get(s)) {
		        if (visited[v] == 0) {
		        	if(visited[s] == 2) {
		        		visited[v] = 1;
		        	}else {
		        		visited[v] = 2;
		        	}
		          q.offer(v);
		        }
		    }
		}
	}
}
