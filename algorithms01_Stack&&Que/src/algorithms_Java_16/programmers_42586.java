package algorithms_Java_16;

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<Integer>();
        Queue<Integer> que = new LinkedList<>();
        
        for(int i = 0; i < progresses.length; i++) {
        	int day_work = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);
        	que.offer(day_work);
        }
        while(!que.isEmpty()) {
            int day = 1;
        	int poll = que.poll();
        	while (!que.isEmpty() && poll >= que.peek()) {
        		day++;
        		que.poll();
        	}
        	list.add(day);
        }
        int [] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}
public class programmers_42586 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		int result[] = solution.solution(progresses , speeds);
		for(int r : result) {
			System.out.print(r);
		}

	}

}
