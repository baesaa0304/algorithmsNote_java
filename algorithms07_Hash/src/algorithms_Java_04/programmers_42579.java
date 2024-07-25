package algorithms_Java_04;

import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> answer = new ArrayList<>();
        /*
         * num : 각 장르별 곡의 총 플레이 횟수
         * music : 각 장르별 각각 곡의 플레이 횟수 
         */
        HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 개수
        HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르에 속하는 노래 및 재생횟수
        for(int i = 0; i < plays.length; i++) {
            if(!num.containsKey(genres[i])) {
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(i, plays[i]);
                music.put(genres[i], map);
                num.put(genres[i], plays[i]);
            } else {
                music.get(genres[i]).put(i, plays[i]);
                num.put(genres[i], num.get(genres[i]) + plays[i]);               
            }
        }
 
        List<String> keySet = new ArrayList(num.keySet());
        Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));
 
        for(String key : keySet) {
            HashMap<Integer, Integer> map = music.get(key);
            List<Integer> genre_key = new ArrayList(map.keySet());
 
            Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));
 
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }
 
        return answer.stream().mapToInt(i -> i).toArray();
    }
}
public class programmers_42579 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		String gen[] = {"classic", "pop", "classic", "classic", "pop"};
		int plays[] = {500, 600, 150, 800, 2500};
		int result[] = solution.solution(gen, plays);
		for(int r : result) {
			System.out.print(r);
		}

	}

}
