package algorithms_Java_03;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	static int[] island;
    
    public static int unionFind(int i){
        if(island[i] == i)
            return i;
        else
            return unionFind(island[i]); //부모노드 
    }
	
	public static int solution(int n, int[][] costs) {
		
        int answer = 0;
        island = new int[n];
        
        Arrays.sort(costs, new Comparator<int[]>(){
           public int compare(int[] o1, int[] o2){
               return o1[2] - o2[2];
           } 
        });
        
        for(int i = 0; i < n; i ++) {
        	 island[i] = i;
        }
           
        
        for(int[] item : costs){
            int a = unionFind(item[0]);
            int b = unionFind(item[1]);
            
            if(a != b){
                answer += item[2];
                island[a] = b;
            }
        
        }
        
        
		return answer;
	}
}

public class programmers_42861 {

	public static void main(String[] args) {
		int N = 4;
		int [][] cost = {
				{0,1,1},{0,2,2},{1,2,5},{1,3,1},{2,3,8}
		
		};
		Solution s = new Solution();
		int result = s.solution(N, cost);
		System.out.println(result);
	}

}
