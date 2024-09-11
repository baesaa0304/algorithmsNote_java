package algorithms_Java_19;

import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int i : arr) {
        	if(!stack.isEmpty() && i == stack.peek()) {
        		continue;
        	}
        	else {
        		stack.add(i);
        	}
        }
        int[] answer = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            answer[index--] = stack.pop();
        }
        return answer;
    }
}
public class progrmmers_12906 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int [] number = {1,1,3,3,0,1,1};
		int result[] = solution.solution(number);
		for(int i : result) {
			System.out.println(result);
		}

	}

}
