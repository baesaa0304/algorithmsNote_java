package algorithms_Java_06;

import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> clothesMap = new HashMap<>();

            // 의상 종류별로 카운트
            for (String[] item : clothes) {
                String type = item[1];
                clothesMap.put(type, clothesMap.getOrDefault(type, 0) + 1);
            }
            // 조합 수 계산
            int answer = 1;
            for (int count : clothesMap.values()) {
                answer *= (count + 1); // 각 카테고리에서 의상을 선택할 수 있는 경우의 수
            }

            return answer - 1; // 시작을 의상 선택으로 함으로 -1
    }
}
public class programmers_42578 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String clothes[][] = {{"yellow_hat", "headgear"}, 
				{"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		int result = solution.solution(clothes);
		System.out.println(result);
		
	}

}
