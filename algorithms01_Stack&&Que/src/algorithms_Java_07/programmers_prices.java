package algorithms_Java_07;
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


