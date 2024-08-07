package algorithms_Java_05;

class Solution {
    public long solution(int n, int[] times) {
    	long answer = 0;
    	
    	long min = 0;
    	long max = (long)times[times.length-1] * (long)n; // 최악의 시간을 구함
    	
    	while(min <= max) {
    		long mid = (min + max) / 2;
    		long people = 0;
    		for(int t : times) {
    			people += mid / t;
        	}
    		if(people >= n) {
    			answer = mid;
    			max = mid - 1;
    		}
    		else {
    			min = mid + 1;
    		}
    	}
    	return answer;
    }
}
public class programmers_43238 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int people = 6;
		int time[] = {7, 10};
		long result = s.solution(people, time);
		System.out.println(result);

	}

}
