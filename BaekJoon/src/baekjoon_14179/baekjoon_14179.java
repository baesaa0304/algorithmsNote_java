package baekjoon_14179;

import java.io.*;
import java.util.*;
public class baekjoon_14179 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken()); // 높이
		int W = Integer.parseInt(st.nextToken()); // 넓이 
		int result = 0;
		
		int block[] = new int[W]; // 블록 의 수 
		int left_rain[] = new int[W]; // 왼쪽
		int right_rain[] = new int[W]; // 오른쪽 
		
		st = new StringTokenizer(br.readLine());
		int water = 0;
		
		for(int i = 0; i < W; i++) {
			block[i] = Integer.parseInt(st.nextToken());
		}
		
		left_rain[0] = block[0];
		for(int i = 1; i < W; i++) {
			left_rain[i] =  Math.max(left_rain[i - 1] , block[i]);
 		}
		
		right_rain[W - 1] = block[W - 1];
		for(int i = W - 2; i >= 0; i--) {
			right_rain[i] =  Math.max(right_rain[i + 1] , block[i]);
 		}

        // 물의 양 계산
        for (int i = 0; i < W; i++) {
            result += Math.min(left_rain[i], right_rain[i]) - block[i];
        }

        System.out.println(result);
    }
}
