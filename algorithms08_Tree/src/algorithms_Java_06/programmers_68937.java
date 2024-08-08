package algorithms_Java_06;

import java.util.*;

class Solution {
    private int n;
    private List<Integer>[] adjList;

    private void init(int n, int[][] edges) {
        this.n = n;
        this.adjList = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            this.adjList[i] = new ArrayList<>();
        }
        for (int[] edge: edges) {
            this.adjList[edge[0]].add(edge[1]);
            this.adjList[edge[1]].add(edge[0]);
        }
    }

    private int findNode(int index) {
        int[] distance = getDistance(index);

        int node = 0;
        int max = 0;
        for (int i = 1; i <= n; i++) {
            if (distance[i] > max) {
                node = i;
                max = distance[i];
            }
        }

        return node;
    }

    private int[] getDistance(int index) {
        int[] distance = new int[n + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[index] = 0;

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(index);

        boolean[] visited = new boolean[n + 1];
        visited[index] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            for (int child: adjList[node]) {
                if (!visited[child]) {
                    visited[child] = true;
                    distance[child] = distance[node] + 1;
                    queue.add(child);
                }
            }
        }

        return distance;
    }

    public int solution(int n, int[][] edges) {
        init(n, edges);

        int a = findNode(1);
        int b = findNode(a);
        int[] distanceA = getDistance(a);
        int[] distanceB = getDistance(b);

        int answer = 0;
        int dist = distanceA[b];
        for (int i = 1; i <= n; i++) {
            if (a == i || b == i) continue;
            int dA = distanceA[i];
            int dB = distanceB[i];

            answer = Math.max(answer, Math.max(dA, dB));
        }

        return answer;
    }
}
public class programmers_68937 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int N = 4;
		int M = 5;
		int Ne[][] = {{1,2},{2,3},{3,4}};
		int Me[][] = {{1,5},{2,5},{3,5},{4,5}};
		int result_N = s.solution(N, Ne);
		System.out.println("1 = " + result_N);
		int result_M = s.solution(M, Me);
		System.out.println("2 = " + result_M);

	}

}
