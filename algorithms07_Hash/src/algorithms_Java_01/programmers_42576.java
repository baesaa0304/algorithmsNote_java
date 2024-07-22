package algorithms_Java_01;

import java.util.HashMap;
//
//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        HashMap<String,String> map = new HashMap<>();
//        for(int i = 0; i < participant.length; i++) {
//        	map.put(participant[i],participant[i]);
//        }
//        for (String c : completion) {
//            if (map.containsKey(c) && map.get(c).equals(c)) {
//                map.remove(c); // 제거 
//            }
//        }
//        for (String key : map.keySet()) {
//            return key; // 제거되지 않은 값을 반환
//        }
//        return "";
//    }
//}
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 참가자의 수를 카운팅
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1); // p에 키 값이 있는 경우 0+1 아닌 경우 1++; 
        }
        System.out.println("해시 값 넣은 "+ map);
        // 완료자의 수를 감소
        for (String c : completion){
            map.put(c, map.get(c) - 1);
        }
        System.out.println("값 찾은" + map);
        // 수가 0이 아닌 참가자를 찾기
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        
        return "";
    }
}
public class programmers_42576 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String [] p = {"mislav", "stanko", "mislav", "ana"};
		String [] c = {"stanko", "ana", "mislav"};
		String result = solution.solution(p, c);
		System.out.println(result);
	}

}
