/*
Determine if a Sudoku is valid, according to: http://sudoku.com.au/TheRules.aspx
The Sudoku board could be partially filled, where empty cells are filled with the character '.'.

The input corresponding to the above configuration :
["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"]
A partially filled sudoku which is valid.
Note:
A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem
*/

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> A) {
        if (A == null)
	        return 0;
	    
	    int n = A.size();
	    
	    if (n != 9 || A.get(0).length() != 9)
	        return 0;
	    
	    HashSet<Character> hashSet = new HashSet<>();
	    
	    for (int i = 0; i < 9; i++) {
	        hashSet.clear();
	        for (int j = 0; j < 9; j++) {
	            char c = A.get(i).charAt(j);
	            if (c == '.')
	                continue;
	            if (hashSet.contains(c))
	                return 0;
	            hashSet.add(c);
	        }
	    }
	    
	    for (int i = 0; i < 9; i++) {
	        hashSet.clear();
	        for (int j = 0; j < 9; j++) {
	            char c = A.get(j).charAt(i);
	            if (c == '.')
	                continue;
	            if (hashSet.contains(c))
	                return 0;
	            hashSet.add(c);
	        }
	    }
	    
	    
	    for (int k = 0; k < 9; k++) {
	        int x = k / 3;
	        int y = k % 3;
	        hashSet.clear();
	        for (int i = 3 * x; i < 3 * x + 3; i++) {
	            for (int j = y * 3; j < y * 3 + 3; j++) {
	                char c = A.get(j).charAt(i);
	                if (c == '.')
	                    continue;
	                if (hashSet.contains(c))
	                    return 0;
	                hashSet.add(c);
	            }
	        }
	        
	    }
	    
	    
	    return 1;
    }
}
