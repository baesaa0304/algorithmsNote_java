package algorithms_Java_08;
import java.util.*;


public class programmers_processes {

	public static void main(String[] args) {
		 Solution solution = new Solution();
		 int priorities1[] = {2, 1, 3, 2};
		 int location1 = 2;
		 int answer1 = solution.solution(priorities1,location1);
		 int priorities2[] = {1, 1, 9, 1, 1, 1};
		 int location2 = 0;
		 int answer2 = solution.solution(priorities2,location2);
		 System.out.println(answer1);
		 System.out.println(answer2);
	}
	
	static class Solution {
	    public int solution(int[] priorities, int location) {
	        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐 선언
	        int answer = 0;
	        // 우선순위 큐에 우선순위 요소 추가
	        for (int i : priorities) {
	            queue.offer(i);
	        }

	        // 큐가 빌 때까지 반복
	        while (!queue.isEmpty()) {
	            // 기존 우선순위 배열 순회
	            for (int i = 0; i < priorities.length; i++) {
	                // 현재 작업의 위치 찾기
	                if (queue.peek() == priorities[i]) {
	                    queue.poll();
	                    answer++;

	                    // 현재 작업이 location과 같으면 answer 반환
	                    if (location == i) {
	                        return answer;
	                    }
	                }
	            }
	        }

	        return answer;
	    }
	}

}
