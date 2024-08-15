package algorithms_Java_17;

//import java.util.LinkedList;
//import java.util.Queue;
//
//class Solution {
//    static int N;
//    static int arr[][];
//    static boolean visited[][];
//    static int[] dx = {-1, 1, 0, 0};
//    static int[] dy = {0, 0, -1, 1};
//
//    public int solution(int[][] maps) {
//        N = maps.length;
//        arr = new int[N][N];
//        visited = new boolean[N][N];
//
//        // 맵 복사 및 거리 초기화
//        for (int i = 0; i < maps.length; i++) {
//            for (int j = 0; j < maps[i].length; j++) {
//                arr[i][j] = maps[i][j];
//            }
//        }
//
//        // BFS 호출
//        return BFS(0, 0);
//    }
//
//    public static int BFS(int x, int y) {
//        Queue<int[]> queue = new LinkedList<>();
//        queue.offer(new int[]{x, y});
//        visited[x][y] = true;
//        arr[x][y] = 1; // 시작점의 거리 초기화
//
//        while (!queue.isEmpty()) {
//            int[] poll = queue.poll();
//            int poll_x = poll[0];
//            int poll_y = poll[1];
//
//            // 목적지 도달 확인
//            if (poll_x == N - 1 && poll_y == N - 1) {
//                return arr[poll_x][poll_y]; // 도달한 위치의 거리 반환
//            }
//
//            for (int i = 0; i < 4; i++) {
//                int nextX = dx[i] + poll_x;
//                int nextY = dy[i] + poll_y;
//
//                // 범위 체크 및 이동 가능 여부 확인
//                if (nextX >= 0 && nextY >= 0 && nextX < N && nextY < N && !visited[nextX][nextY] && arr[nextX][nextY] == 1) {
//                    queue.offer(new int[]{nextX, nextY});
//                    visited[nextX][nextY] = true; // 체크
//                    arr[nextX][nextY] = arr[poll_x][poll_y] + 1; // 거리 업데이트
//                }
//            }
//        }
//
//        return -1; // 도달 불가능
//    }
//}

import java.util.*;

class Solution {
    public static int n, m;
    public static int answer = -1;
    
    public static int dx[] = {-1, 1, 0, 0};
    public static int dy[] = {0, 0, -1, 1};
    public static boolean visited[][];
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];
    
        return bfs(0, 0, maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]> que = new LinkedList<>();
    
        que.add(new int[]{x, y, 1});
        visited[0][0] = true;

        while (!que.isEmpty()) {
            int temp[] = que.poll();
            x = temp[0];
            y = temp[1];
            int count = temp[2];
            
            if (x == n-1 && y == m-1) {
                answer = count;
                break;
            }

            for (int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m) continue;
                if(maps[nx][ny] == 0) continue;
                if(!visited[nx][ny] && maps[nx][ny] == 1) {
                    visited[nx][ny] = true;
                    que.add(new int[]{nx, ny, count+1});
                }
            }
        }

        return answer;
    }
}
  

public class programmers_1844 {

	public static void main(String[] args) {
		int map[][] = {
				{1,0,1,1,1},
				{1,0,1,0,1},
				{1,0,1,1,1},
				{1,1,1,0,1},
				{0,0,0,0,1}
				};
		Solution s = new Solution();
		
		int result = s.solution(map);
		System.out.println(result);

	}

}
