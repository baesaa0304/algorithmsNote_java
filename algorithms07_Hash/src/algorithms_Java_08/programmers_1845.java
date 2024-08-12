package algorithms_Java_08;

import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        // 전체 포켓몬 수의 절반
        int n = nums.length / 2; 
        // 중복을 제거하여 포켓몬 종류 수를 계산
        HashSet<Integer>poketmon = new HashSet<>();
        for(int i : nums) {
        	poketmon.add(i);
        }
        System.out.println(poketmon.size());
        answer = Math.min(poketmon.size(), n);
        return answer;
    }
}
public class programmers_1845 {

	public static void main(String[] args) {
		int n[] = {3,3,3,2,2,4};
		Solution s = new Solution();
		int result = s.solution(n);
		System.out.println("결과  = " + result);

	}

}
