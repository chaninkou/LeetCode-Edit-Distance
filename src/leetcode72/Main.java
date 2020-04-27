package leetcode72;

public class Main {
	public static void main(String[] args) {
		String word1 = "horse";
		
		String word2 = "ros";
		
		System.out.println("Word1: " + word1);
		
		System.out.println("Word2: " + word2);
		
		FindMinConvertFunction solution = new FindMinConvertFunction();
		
		System.out.println("Solution: " + solution.minDistance(word1, word2));
	}
}
