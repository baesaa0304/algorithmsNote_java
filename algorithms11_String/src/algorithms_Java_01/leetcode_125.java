package algorithms_Java_01;

class Solution {
    public boolean isPalindrome(String s) {
    	String onlyLetters = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    	System.out.println(onlyLetters);
    	String word = new StringBuffer(onlyLetters).reverse().toString();
    	System.out.println(word);
        if(word.equals(onlyLetters)) {
        	return true;
        }
        return false;
    }
}

public class leetcode_125 {

	public static void main(String[] args) {
		String words = "0P";
		Solution s = new Solution();
		boolean b = s.isPalindrome(words);
		System.out.println(b);

	}

}
