package algorithms_Java01_e;

import java.util.*;

public class Immigration_programmers {
	public long solution(int n, int[] times) {
		long answer = 0;
    long min_time = 0;
    long max_time =  (long)times[times.length-1]*(long)n;
        while(min_time <= max_time) {
			long mid = (min_time + max_time) / 2;
            long people = 0; // 입국 심사 끝난 사람	
			for(int time : times) {
				people += mid / time;
			}
			if (people >= n) {
				answer = mid;
				max_time = mid - 1;
			}
			else {
				min_time = mid + 1;
			}
		}
        return answer;
    }
	public static void main(String[] args) {
		Immigration_programmers solution = new Immigration_programmers();
        int n = 6; // 입국 심사를 기다리는 사람의 수
        int[] times = {7, 10}; // 각 심사관이 한 명을 심사하는데 걸리는 시간
        long result = solution.solution(n, times);
        System.out.println(result);
	}
}
