package algorithms_Java01_10;
import java.util.Arrays;
import java.util.Stack;


public class programmers_prices {

	public static void main(String[] args) {
		// 가격 배열 예시
        int[] prices = {1, 2, 3, 2, 3};

        // Solution1 인스턴스 생성 및 메서드 실행
        Solution1 solution1 = new Solution1();
        int[] answer1 = solution1.solution(prices);
        System.out.println("Solution1: " + Arrays.toString(answer1));

        // Solution2 인스턴스 생성 및 메서드 실행
        Solution2 solution2 = new Solution2();
        int[] answer2 = solution2.solution(prices);
        System.out.println("Solution2 : " + Arrays.toString(answer2));
    }
}
		
class Solution1 {
	   public int[] solution(int[] prices) {
	        int[] answer = new int[prices.length];
	        for (int i = 0; i < prices.length; i++) {
	            for (int j = i + 1; j < prices.length; j++) {
	                answer[i]++;
	                if (prices[i] > prices[j]) {
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	}



class Solution2 {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < n; i++) {
            // 스택이 비어 있지 않고, 현재 가격이 스택의 최상단 가격보다 낮을 때
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop(); // 스택에서 인덱스를 꺼냄
                answer[idx] = i - idx; // 가격이 떨어지기까지의 시간 계산
            }
            stack.push(i); // 현재 인덱스를 스택에 추가
        }
        
        // 스택에 남아 있는 가격들에 대해 남은 시간을 계산
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - idx - 1; // 끝까지 가격이 떨어지지 않은 경우
        }
        
        return answer;
    }
}
