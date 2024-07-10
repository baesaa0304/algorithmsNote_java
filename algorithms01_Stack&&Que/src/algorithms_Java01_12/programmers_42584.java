package algorithms_Java01_12;

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int N = prices.length;
        int[] answer = new int[N];
        /**
         * 2중 For문 이용 
         * 시간복잡도 : O(N^2)
         * 스택이 가장 좋다.
         */
        for (int i = 0; i < N; i++) { 
            int time = 0;
            for (int j = i + 1; j < N; j++) {
                time++;
                if (prices[i] > prices[j]) { // 현재 주식 가격이 다음 주식 가격보다 크면 break
                    break;
                }
            }
            answer[i] = time; // 각 지속된 시간을 answer에 저장 
        }

        return answer;
    }
}


public class programmers_42584 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int won[] = {1, 2, 3, 2, 3};
		int result[] = solution.solution(won);
		for(int m : result) {
			System.out.println(m);
		}
	}

}
