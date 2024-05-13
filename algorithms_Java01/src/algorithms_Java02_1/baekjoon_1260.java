package algorithms_Java02_1;


import java.io.*;
import java.util.*;
public class baekjoon_1260 {
	
	static StringBuilder sb = new StringBuilder();
	static Queue<Integer>que = new LinkedList<>();
	static boolean[] visit;
	static int node , line, start;
	static int[][] arr;
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		 node = Integer.parseInt(st.nextToken());
		 line = Integer.parseInt(st.nextToken());
		 start = Integer.parseInt(st.nextToken());
		
		arr = new int[node + 1][node +1];
		visit = new boolean[node + 1];
		
		for (int i = 0; i< line; i++) {
		StringTokenizer str = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(str.nextToken());
		int b = Integer.parseInt(str.nextToken());
		arr[a][b] = arr[b][a] =  1;
		}
		dfs(start);
		sb.append("\n");
		visit = new boolean[node + 1];
		
		bfs(start);
		System.out.println(sb);
		
		
		
	}
	public static void dfs(int start) {
		visit[start] = true; // 노드 중복 접근 방지를 위한 방문 체크 배열(boolean)
		sb.append(start + " "); // 방문했으면 sb 추가
		for (int i = 1; i <= node; i++) { // i 는 dfs 배열의 새로운 분기를 뜻함
			if (arr[start][i] == 1 && visit[i] == false) {
				dfs(i);
			}
		}
		
	}
	
	public static void bfs(int start) {
		que.offer(start);
		visit[start] = true;
		
		while(!que.isEmpty()) {
			int temp = que.poll();
			sb.append(temp + " ");
			for(int i = 1; i < node+1; i++) {
				if(arr[temp][i] == 1 && visit[i]==false) {
					que.offer(i);
					visit[i] = true;
				}
			}
		}
		
	}
	
	

}
