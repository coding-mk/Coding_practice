/*
Problem Description
You are given N towns (1 to N). All towns are connected via unique directed path as mentioned in the input.
Given 2 towns find whether you can reach the first town from the second without repeating any edge.
B C : query to find whether B is reachable from C.
Input contains an integer array A of size N and 2 integers B and C ( 1 <= B, C <= N ).
There exist a directed edge from A[i] to i+1 for every 1 <= i < N. Also, it's guaranteed that A[i] <= i for every 1 <= i < N.
NOTE: Array A is 0-indexed. A[0] = 1 which you can ignore as it doesn't represent any edge.

Problem Constraints
1 <= N <= 100000

Input Format
First argument is vector A
Second argument is integer B
Third argument is integer C

Output Format
Return 1 if reachable, 0 otherwise.

Example Input
Input 1:

 A = [1, 1, 2]
 B = 1
 C = 2
Input 2:
 A = [1, 1, 2]
 B = 2
 C = 1

Example Output
Output 1:
 0
Output 2:
 1

Example Explanation
Explanation 1:
 Tree is 1--> 2--> 3 and hence 1 is not reachable from 2.
Explanation 2:
 Tree is 1--> 2--> 3 and hence 2 is reachable from 1.
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int solve(int[] A, final int B, final int C) {
        HashMap<Integer,List<Integer>> map = new HashMap<Integer,List<Integer>>();
		for(int i=0;i<A.length;i++) {
			map.put(i, new ArrayList<Integer>());
		}
		List<Integer> temp;
		for(int i=1;i<A.length;i++) {
			temp = map.get(A[i]);
			temp.add(i+1);
			map.put(A[i],temp);
		}
		if(dfs(map,C,B)) {
			return 1;
		}
		return 0;
    }

    public static boolean dfs(HashMap<Integer,List<Integer>> map, int S,int D) {
		if(S==D) {
			return true;
		}
		List<Integer> temp= map.get(S);
		if(temp == null) {
			return false;
		}
		for(int i:temp) {
			if(dfs(map,i,D)) {
				return true;
			}
		}
		return false;
	}
}
