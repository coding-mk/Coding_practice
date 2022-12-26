public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> mulMatrix = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        int sum=0;
        for(int i=0;i<A.size();i++){
            row = new ArrayList<Integer>();
            for(int j=0;j<B.get(0).size();j++){
                sum=0;
                for(int k=0;k<A.get(0).size();k++){
                    sum+=A.get(i).get(k)*B.get(k).get(j);
                }
                row.add(sum);
            }
            mulMatrix.add(row);
        }
        return(mulMatrix);
    }
}
