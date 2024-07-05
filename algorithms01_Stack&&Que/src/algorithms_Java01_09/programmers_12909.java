package algorithms_Java01_09;

import java.util.*;

class Solution {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character>stack = new Stack<>();
		for(char bracket : s.toCharArray()) {
			if(bracket == '(') {
				stack.push(bracket);
			}
			else if(bracket == ')') {
				if(stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
		if(stack.isEmpty()) {
			return answer;
		}else {
			return false;
		}
        
    }
	
}

public class programmers_12909 {

	public static void main(String[] args) {
		String bk = "(()(";
		Solution solution = new Solution();
		boolean result = solution.solution(bk);
		System.out.println(result);

	}

}
