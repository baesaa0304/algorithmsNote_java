package algorithms06_Java01_02;

import java.util.*;

class Solution {
  public int[] solution(int N, int[] stages) {
 
    int[] challenger = new int[N + 2];
    for (int i = 0; i < stages.length; i++) {
      challenger[stages[i]] += 1;
    }

  
    HashMap<Integer, Double> fails = new HashMap<>();
    double total = stages.length;

    
    for (int i = 1; i <= N; i++) {
      if (challenger[i] == 0) { 
        fails.put(i, 0.);
      }
      else {
        fails.put(i, challenger[i] / total); 
        total -= challenger[i]; 
      }
    }

    //실패율이 높은 스테이지부터 내림차순으로 정렬
    List<Map.Entry<Integer, Double>> failList = new ArrayList<>(fails.entrySet());
        failList.sort((a, b) -> Double.compare(b.getValue(), a.getValue()));

        int[] answer = new int[N];
        for (int i = 0; i < N; i++) {
            answer[i] = failList.get(i).getKey();
        }  
    return answer;
  }
}




public class programmers42889 {

	public static void main(String[] args) {
		int N = 5;
		int []stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		
		Solution solution = new Solution();
        int[] result = solution.solution(N, stages);
        
		for(int i : result) {
			System.out.print(i);
		}

	}

}
