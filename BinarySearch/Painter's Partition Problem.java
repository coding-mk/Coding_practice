/*Problem Description
Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time to paint 1 unit of the board.

Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
NOTE:
1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

Return the ans % 10000003.

Problem Constraints
1 <= A <= 1000
1 <= B <= 106
1 <= N <= 105
1 <= C[i] <= 106

Input Format
The first argument given is the integer A.
The second argument given is the integer B.
The third argument given is the integer array C.

Output Format
Return minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of board % 10000003.

Example Input
Input 1:
 A = 2
 B = 5
 C = [1, 10]
Input 2:
 A = 10
 B = 1
 C = [1, 8, 11, 3]

Example Output
Output 1:
 50
Output 2:
 11

Example Explanation
Explanation 1:

 Possibility 1:- One painter paints both blocks, time taken = 55 units.
 Possibility 2:- Painter 1 paints block 1, painter 2 paints block 2, time take = max(5, 50) = 50
 There are no other distinct ways to paint boards.
 ans = 50 % 10000003
Explanation 2:

 Each block is painted by a painter so, Painter 1 paints block 1, painter 2 paints block 2, painter 3 paints block 3 
 and painter 4 paints block 4, time taken = max(1, 8, 11, 3) = 11
 ans = 11 % 10000003*/

public class Solution {
    private static final int MOD = 10000003;

    public int paint(int A, int B, ArrayList<Integer> C) {
        long res = Long.MAX_VALUE;
      long low = 0;
      long high = Long.MAX_VALUE;
      long mid;

      while (low <= high) {
         mid = low + ((high - low) >> 1);
         boolean status = possible(A, B, C, mid);
         if (status) {
            res = mid;
            high = mid - 1;
         } else {
            low = mid + 1;
         }
      }
      return (int)(res % MOD);
    }

    private boolean possible(int A, int B, ArrayList < Integer > C, long time) {
      int n = C.size();
      int index = 0;
      long total;

      for (int i = 0; i < A && index < n; i++) {
         total = 0;
         while (total < time && index < n) {
            total += (1L * C.get(index) * B);
            if (total > time)
               break;
            index++;
         }
      }
      if (index != n)
         return false;
      return true;
   }
}