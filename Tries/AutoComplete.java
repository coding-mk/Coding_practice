/*
Problem Description
There is a dictionary A of N words, and ith word has a unique weight Wi.
Another string array B of size M contains the prefixes. For every prefix B[i], output atmost 5 words from the dictionary A that start with the same prefix.
Output the words in decreasing order of their weight.
NOTE: If there is no word that starts with the given prefix output -1.

Problem Constraints
1 <= T <= 5
1 <= N <= 20000
1 <= M <= 10000
1 <= Wi <= 106
1 <= length of any string either in A or B <= 30

Input Format
First line is an integer T denoting the number of test cases.
For each test case,
First line denotes two space seperated integer N and M.
Second line denotes N space seperated strings denoting the words in dictionary.
Third line denotes N space seperated integers denoting the weight of each word in the dictionary.
Fourth line denotes M space seperated integers denoting the prefixes.

Output Format
For every prefix B[i], print the space seperated output on a new line.
NOTE: After every output there should be a space.

Example Input
Input 1:
 1
 6 3
 abcd aecd abaa abef acdcc acbcc
 2 1 3 4 6 5
 ab abc a
Input 2:
 1
 5 3
 aaaa aacd abaa abaa aadcc
 3 4 1 2 6 
 aa aba abc

Example Output
Output 1:
 abef abaa abcd 
 abcd 
 acdcc acbcc abef abaa abcd 
Output 2:
 aadcc aacd aaaa 
 abaa abaa 
 -1 

Example Explanation
Explanation 1:
 For the prefix "ab" 3 words in the dictionary have same prefix: ("abcd" : 2, "abaa" : 3, "abef" : 4). Ouput them in decreasing order of weight.
 For the prefix "abc" only 1 word in the dictionary have same prefix: ("abcd" : 2).
 For the prefix "a" all 6 words in the dictionary have same prefix: ("abcd" : 2, "aecd" : 1, "abaa" : 3, "abef" : 4, "acdcc" : 6, "acbcc" : 5).
 Since we can output atmost 5 words. Output top 5 weighted words in decreasing order of weight.
Explanation 2:
 For the prefix "aa" 3 words in the dictionary have same prefix: ("aaaa" : 3, "aacd" : 4, "aadcc" : 6). Ouput them in decreasing order of weight.
 For the prefix "aba" 2 words in the dictionary have same prefix: ("abaa" : 1, "abaa" : 2).
 For the prefix "abc" there is no word in the dictionary which have same prefix. So print -1.
*/
import java.lang.*;
import java.util.*;

public class Main {
    static final int ALPHABET_SIZE = 26;
    static TrieNode root;
    static class TrieNode {
        TrieNode[] children = new TrieNode[ALPHABET_SIZE];
        ArrayList<Integer> index = new ArrayList<Integer>();
        boolean isEndOfWord;
        TrieNode() {
            isEndOfWord = false;
            for (int i = 0; i < ALPHABET_SIZE; i++)
                children[i] = null;
        }
    };
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
		    String[] words = new String[n];
		    for (int j = 0; j < n; j++) {
		    	words[j] = sc.next();
		    }
		    int[][] weight = new int[n][2];
		    for (int j = 0; j < n; j++) {
		         weight[j][0] = sc.nextInt();
		         weight[j][1] = j;
		    }
		    TrieNode root = new TrieNode();
			Arrays.sort(weight, (a, b)->Integer.compare(b[0], a[0])); 
			for (int j = 0; j <weight.length; j++) { 
				insert(words[weight[j][1]], weight[j][1],root); 
			}
			String str="";
			for (int j = 0; j < m; j++) {
				str = sc.next();
				search(str, words, root);
			}
        }
        sc.close();
    }
    static void insert(String key,int position,TrieNode root) {
        int level;
        int length = key.length();
        int val;
        TrieNode pCrawl = root;
        for (level = 0; level < length; level++) {
            val = key.charAt(level) - 'a';
            if (pCrawl.children[val] == null) {
            	pCrawl.children[val] = new TrieNode();
            	pCrawl.children[val].index.add(position);
            }else {
            	pCrawl.children[val].index.add(position);
            }
            pCrawl = pCrawl.children[val];
            
        }
        pCrawl.isEndOfWord = true;
    }
	static void search(String pat, String[] words, TrieNode root) {
		int level;
        int length = pat.length();
        int val=0,flag=0;
        TrieNode pCrawl = root;
        for (level = 0; level < length; level++) {
            val = pat.charAt(level) - 'a';
            if (pCrawl.children[val] == null) {
            	System.out.println(-1+" ");
            	flag=1;
             	break;
            }
            pCrawl = pCrawl.children[val];
        }
        if(flag==0) {
        	int i=0;
            while(i<pCrawl.index.size() &&  i<5) {
            	System.out.print(words[pCrawl.index.get(i)]+" ");
            	i++;
            }
            System.out.println("");
        }
    }
}
