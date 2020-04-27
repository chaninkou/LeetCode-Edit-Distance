package leetcode72;

public class FindMinConvertFunction {
	// O(a * b) time and O(a * b) space since dp[][]
	public int minDistance(String word1, String word2) {
		int a = word1.length();

		int b = word2.length();

		int[][] dp = new int[a + 1][b + 1];

		// Base case, make a to b
		for (int i = 0; i <= a; i++) {
			dp[i][0] = i;
		}

		for (int j = 0; j <= b; j++) {
			dp[0][j] = j;
		}
		
		// dp[i][j] is replace
		// dp[i + 1][j] is insert
		// dp[i][j + 1] is delete
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				// If both character are the same, just do replace 
				if (word1.charAt(i) == word2.charAt(j)) {
					dp[i + 1][j + 1] = dp[i][j];
				} else {
					int replace = dp[i][j];

					int delete = dp[i][j + 1];

					int insert = dp[i + 1][j];

					// Get the minimum operations to convert
					dp[i + 1][j + 1] = Math.min(replace, Math.min(delete, insert)) + 1;
				}
			}
		}

		return dp[a][b];
	}
}
