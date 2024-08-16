package algorithms_Java_18;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
       
        for(int i = 0; i < n; i++) {
        	if(!visited[i]) {
        		DFS(i , computers, visited);
        		answer++;
        	}
        }
        return answer;
    }
	public void DFS(int com , int[][] computers , boolean[] visited) {
		visited[com] = true;
		for(int i = 0; i < computers[com].length; i++) {
			if(computers[com][i] == 1 && !visited[i]) {
				 DFS(i,computers, visited);
			}
		}
	}
}


//class Solution {
//    static boolean[] visited;
//
//    public int solution(int n, int[][] computers) {
//        int answer = 0;
//        visited = new boolean[n];
//
//        for (int i = 0; i < n; i++) {
//            if (!visited[i]) {
//                BFS(i, computers, visited);
//                answer++;
//            }
//        }
//        return answer;
//    }
//
//    public void BFS(int com, int[][] computers, boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.offer(com);
//        visited[com] = true;
//
//        while (!queue.isEmpty()) {
//            int current = queue.poll();
//
//            for (int i = 0; i < computers[current].length; i++) {
//                if (computers[current][i] == 1 && !visited[i]) {
//                    queue.offer(i);
//                    visited[i] = true;
//                }
//            }
//        }
//    }
//}


public class programmers_43162 {	
	public static void main(String[] args) {
		int N = 3;
		int cpu[][] = {
				{1, 1, 0},
				{1, 1, 0},
				{0, 0, 1}
		};
		Solution s = new Solution();
		int result = s.solution(N, cpu);
		System.out.println(result);
	}
}
