/*
Problem Description
Given a directed graph with A nodes and M edges.
Find the minimum number of edges that needs to be reversed in order to reach node A from node 1.

Problem Constraints
1 <= A, M <= 10 5
1 <= B[i][0], B[i][1] <= A
There can be multiple edges or self loops (B[i][0] = B[i][1])

Input Format
The first argument is an integer A, denoting the number of nodes in the graph.
The second argument is a 2D integer array B, denoting the directed edges in the graph.

Output Format
Return a single integer denoting the minimum number of edges to be reversed.

Example Input
Input 1:
A = 5
B = [[1, 2],
     [2, 3],
     [4, 3],
     [4, 5]]
Input 2:
A = 5
B = [[1, 2],
     [2, 3],
     [3, 4],
     [4, 5]]

Example Output
Output 1:
1
Output 2:
0

Example Explanation
Explanation 1:
Reversing the edge (4, 3) is only required.
Explanation 2:
There already exists a path between 1 and A, so no edges need to be reversed.
*/

class Pairs1
{
    int first, second;
 
    public Pairs1(int first, int second)
    {
        this.first = first;
        this.second = second;
    }
}

class Graph{
final int INF = (int)0x3f3f3f3f;
 
int V;

List<Pairs1>[] adj;
 

@SuppressWarnings("unchecked")
public Graph(int V)
{
    this.V = V;
    adj = new ArrayList[V];
 
    for(int i = 0; i < V; i++)
    {
        adj[i] = new ArrayList();
    }
}
 
void addEdge(int u, int v, int w)
{
    adj[u].add(new Pairs1(v, w));
}
 
int[] shortestPath(int src)
{
     
    Set<Pairs1> setds = new HashSet<Pairs1>();
 
    int[] dist = new int[V];
    Arrays.fill(dist, INF);
 
    setds.add(new Pairs1(0, src));
    dist[src] = 0;
 
    while (!setds.isEmpty())
    {
        Iterator<Pairs1> itr = setds.iterator();
        Pairs1 tmp = itr.next();
        itr.remove();
 
        int u = tmp.second;
 
        for(Pairs1 p : adj[u])
        {
            int v = p.first;
            int weight = p.second;

            if (dist[v] > dist[u] + weight)
            {
                 
                if (dist[v] != INF)
                {
                    setds.remove(new Pairs1(dist[v], v));
                }
                 
                dist[v] = dist[u] + weight;
                setds.add(new Pairs1(dist[v], v));
            }
        }
    }
    return dist;
}
}


public class Solution {
    final int INF = (int)0x3f3f3f3f;

    public int reverseEdges(int A, int[][] B) {
        int E = B.length;
		 
	    int minEdgeToReverse = getMinEdgeReversal(B, E, A+1, 1, A);
	     
	    if (minEdgeToReverse != -1)
	        return minEdgeToReverse;
        else
            return -1;
    }
	
	public Graph modelGraphWithEdgeWeight(int edge[][],
	                                      int E, int V)
	{
	    Graph g = new Graph(V);
	    for(int i = 0; i < E; i++)
	    {

	        g.addEdge(edge[i][0], edge[i][1], 0);
	 
	        g.addEdge(edge[i][1], edge[i][0], 1);
	    }
	    return g;
	}
	 
	public int getMinEdgeReversal(int edge[][], int E,
	                              int V, int src, int dest)
	{
	    Graph g = modelGraphWithEdgeWeight(edge, E, V);

	    int[] dist = g.shortestPath(src);
	 
	    if (dist[dest] == INF)
	        return -1;
	    else
	        return dist[dest];
	}
}
