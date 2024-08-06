package algorithms_Java_10;

import java.util.*;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        Queue<Character> queue = new LinkedList<>();

        // 문자열을 큐에 넣기
        for (char c : s.toCharArray()) {
            queue.offer(c);
        }

        for (int i = 0; i < s.length(); i++) {
            Stack<Character> stack = new Stack<>();

            // 큐의 첫 번째 문자부터 처리
            for (int j = 0; j < s.length(); j++) {
                char c = queue.poll();
                queue.offer(c);

                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (c == ')' && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

            if (stack.isEmpty()) {
                answer++;
            }

            // 큐의 첫 번째 문자를 뒤로 보내기
            queue.offer(queue.poll());
        }

        return answer;
    }
}


public class programmers_76502 {
	public static void main(String[] args) {
		String s = "[](){}";
        int result = Solution.solution(s);
        System.out.println("Result: " + result); // Output: Result: 3
	}
	
}
