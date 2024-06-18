package algorithms_Java02_3;

import java.io.*;
import java.util.*;


public class bekjoon_BFS_1012 {
	static int T , M , N , K;
	static int arr[][];
	static boolean visit[][];
	static int cnt;
	static int [] dx = {-1, 1, 0, 0};
	static int [] dy = {0, 0, -1, 1};
	static ArrayList<Integer> result = new ArrayList<>();
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			cnt = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			arr = new int[M][N];
			visit = new boolean[M][N];
			
			for (int j = 0; j < K; j++){
				StringTokenizer sts = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(sts.nextToken());
				int y = Integer.parseInt(sts.nextToken());
				arr[x][y] = 1;
			}
			
			for(int k = 0; k < M; k++) {
				for(int p = 0; p < N; p++) {
					if(arr[k][p] == 1 && !visit[k][p]) {
						bfs(k, p);
						cnt++;	
					}
				}
			}
			result.add(cnt);	
		}
		for(int i =0; i < result.size(); i ++) {
			System.out.println(result.get(i));
		}

	}

		public static void bfs(int x, int y) {
			Queue<int[]> que = new LinkedList<>();
			// bfs에서 que의 역할은 다음 탐색할 좌표를 미리 정해놓는 것
			//bfs 1번 실행될때마다 인접한 곳을 모두 탐색하고 종료되니 bfs에 que를 선언
			que.offer(new int[] {x,y}); // x, y 좌표 저장
			visit[x][y] = true; // 시작좌표엔 배추가 있으니 미리 true로 처리
			while(!que.isEmpty()) { // que가 비어있으면 더이상 인접한 배추가 없다는 뜻
				int[] poll = que.poll(); // 저장된 큐를 꺼냄
				for (int i = 0; i < 4; i++) { // 상하좌우 배추가 있는 확인
					int next_x = dx[i] + poll[0];
					int next_y = dy[i] + poll[1];
					if (next_x >= 0 && next_y >= 0 && next_x < M && next_y < N && !visit[next_x][next_y] && arr[next_x][next_y] == 1) {
						que.offer(new int[] {next_x,next_y}); // 만약 상하좌우에 배추가 있고 체크하지 않은곳이라면 좌표를 지정
						visit[next_x][next_y] = true; // 체크
					}
			}
		}
	}

}


