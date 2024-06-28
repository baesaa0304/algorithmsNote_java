package algorithms_Java03_07;
import java.util.*;
import java.io.*;

public class baekjoon_1783 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 세로 
		int M = Integer.parseInt(st.nextToken()); // 가로
		if(N == 1) {
			System.out.println(1);
		} else if (N == 2) {
			System.out.println(Math.min(4, (M + 1) / 2));
		} else {
			if(M < 7) {
				System.out.println(Math.min(4, M));
            } else {
            	System.out.println(M - 7 + 5);
			}
		}
		// 1. 이동횟수가 4번 보다 적지 않으면 이동방법 하나씩 사용 
		// 2, 4번보다 적으면 제약이 없음 
		/**
		 * 
		2칸 위로, 1칸 오른쪽 y + 2 ,x + 1
		1칸 위로, 2칸 오른쪽 y + 1, x + 2
		1칸 아래로, 2칸 오른쪽 y - 1 , x + 2
		2칸 아래로, 1칸 오른쪽 y - 2 , x + 1
		 */
		
		
		
		

	}

}
