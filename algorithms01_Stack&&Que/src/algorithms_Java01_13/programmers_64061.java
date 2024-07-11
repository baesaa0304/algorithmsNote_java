package algorithms_Java01_13;

import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int N = board.length;
        
        // 각 열의 스택을 배열로 저장합니다.
        Stack<Integer>[] stacks = new Stack[N];
        for (int i = 0; i < N; i++) {
            stacks[i] = new Stack<>();
        }
        
        // board를 역순으로 탐색하며 각 열의 스택에 인형을 추가합니다.
        for (int i = N - 1; i >= 0; i--) {
            for (int j = 0; j < N; j++) {
                if (board[i][j] != 0) {
                    stacks[j].push(board[i][j]);
                }
            }
        }
        
        // 바구니를 스택으로 생성
        Stack<Integer> bucket = new Stack<>();
        
        // moves를 순회하며 인형을 뽑아 바구니에 추가
        for (int move : moves) {
            int col = move - 1; // move는 1부터 시작하므로 0부터 시작하도록 변환
            if (!stacks[col].isEmpty()) {
                int doll = stacks[col].pop();
                if (!bucket.isEmpty() && bucket.peek() == doll) {
                    bucket.pop();
                    answer += 2; // 사라진 인형의 개수 증가
                } else {
                    bucket.push(doll);
                }
            }
        }
        
        return answer;
    }


  public static void main(String[] args) {
    // 예제 보드와 이동 배열
    int[][] board = {
      {0,0,0,0,0},
      {0,0,1,0,3},
      {0,2,5,0,1},
      {4,2,4,4,2},
      {3,5,1,3,1}
    };
    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

    // Solution 객체 생성 및 메서드 호출
    Solution solution = new Solution();
    int result = solution.solution(board, moves);

    // 결과 출력
    System.out.println("Result: " + result);
  }
}

public class programmers_64061 {

	public static void main(String[] args) {
		// board 배열 초기화
	    int[][] board = {
	      {0,0,0,0,0},
	      {0,0,1,0,3},
	      {0,2,5,0,1},
	      {4,2,4,4,2},
	      {3,5,1,3,1}
	    };

	    // moves 배열 초기화
	    int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

	    // Solution 객체 생성 및 메서드 호출
	    Solution solution = new Solution();
	    int result = solution.solution(board, moves);

	    // 결과 출력
	    System.out.println(result);
	  }

}
