package algorithms_Java01_11;

import java.util.*;

class Soultion{
	public int solution(String s) {
		int answer = 1;
		Stack<Character>stack = new Stack<Character>();
		for(char c : s.toCharArray()){
			if(stack.isEmpty()) {
				stack.push(c);
			}
			else if(c == stack.peek()) {
				stack.pop();
			}
			else {
				stack.push(c);
			}
		}
		if(!stack.isEmpty()) {
			return 0;
		}
		return answer;
	} 
}

public class programmers_12973 {
	public static void main(String[] args) {
		String pair1 = "baabaa";
		String pair2 = "cdcd";
		Soultion soultion = new Soultion();
		int result1 = soultion.solution(pair1);
		int result2 = soultion.solution(pair2);
		System.out.println(result1);
		System.out.println(result2);
	}

}
