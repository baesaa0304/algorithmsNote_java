package algorithms_Java01_12;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int N = prices.length;
        int[] answer = new int[N];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
        	// 현 주식 가격이 다음 주식 가격 보다 큰 경우 즉 주식이 떨어진 경우 
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) { 
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = N - idx - 1;
        }

        return answer;
    }
}

public class programmers_42584 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int won[] = {1, 2, 3, 2, 3};
        int result[] = solution.solution(won);
        for (int m : result) {
            System.out.println(m);
        }
    }
}