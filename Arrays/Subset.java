/*
Problem Description
Given a set of distinct integers A, return all possible subsets.
NOTE:
Elements in a subset must be in non-descending order.
The solution set must not contain duplicate subsets.
Also, the subsets should be sorted in ascending ( lexicographic ) order.
The list is not necessarily sorted.

Problem Constraints
1 <= |A| <= 16
INTMIN <= A[i] <= INTMAX

Input Format
First and only argument of input contains a single integer array A.

Output Format
Return a vector of vectors denoting the answer.

Example Input
Input 1:
A = [1]
Input 2:
A = [1, 2, 3]

Example Output
Output 1:
[
    []
    [1]
]
Output 2:

[
 []
 [1]
 [1, 2]
 [1, 2, 3]
 [1, 3]
 [2]
 [2, 3]
 [3]
]


Example Explanation
Explanation 1:

 You can see that these are all possible subsets.
Explanation 2:

You can see that these are all possible subsets.
*/
public class Solution {
    public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        HashSet<Integer> hs=new HashSet<>();
        
        for(int i=0;i<A.size();i++)
        {
            hs.add(A.get(i));
        }
        A.clear();
        
        Iterator<Integer> i=hs.iterator();
        
        while(i.hasNext())
        {
            int n=i.next();
            A.add(n);
        }
        Collections.sort(A);
        
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> subsets=new ArrayList<>();
        
        int index=0;
        ssutil(A,subsets,ans,0);
        
        return ans;
    }
    
    public void ssutil(ArrayList<Integer> a,ArrayList<Integer> subsets,
                ArrayList<ArrayList<Integer>> ans,int index)
    {
        
        ArrayList<Integer> temp=new ArrayList<>();
        
        for(int t=0;t<subsets.size();t++)
        {
            int t3=subsets.get(t);
            temp.add(t3);
        }
       ans.add(temp);
       
       for(int i=index;i<a.size();i++)
       {
           subsets.add(a.get(i));
           
           ssutil(a,subsets,ans,i+1);
           
         //  int temp1=(a.get(i));
           subsets.remove(subsets.size()-1);
       }
       return;
    }
}
