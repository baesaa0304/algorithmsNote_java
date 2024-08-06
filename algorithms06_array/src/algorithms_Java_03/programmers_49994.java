package algorithms_Java_03;
import java.util.*;

class Solution {
    public int solution(String dirs) {
        // 초기화
        Set<String> visit = new HashSet<>();
        int x = 0, y = 0;
        
        // 방향별 이동
        for (char dir : dirs.toCharArray()) {
            int nx = x, ny = y;
            if (dir == 'U' && y < 5) {
	            ny++;
            }
            else if (dir == 'D' && y > -5){
	            ny--;
            } 
            else if (dir == 'L' && x > -5) {
	            nx--;
	          }  
            else if (dir == 'R' && x < 5) {
	            nx++;
            }

            // 유효한 이동인 경우 경로 추가
            if (nx != x || ny != y) {
                visit.add(x + "," + y + "," + nx + "," + ny);
                visit.add(nx + "," + ny + "," + x + "," + y);
                x = nx; // 새로운 좌표로 업데이트
                y = ny;
            }
        }

        // 고유 경로의 수 반환
        return visit.size() / 2;
    }
}
public class programmers_49994 {

	public static void main(String[] args) {
		String word = "ULURRDLLU";
		Solution solution = new Solution();
		int answer = solution.solution(word);
		System.out.println(answer);
	}

}
