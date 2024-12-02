package baekjoon_13335;

import java.io.*;
import java.util.*;

public class baekjoon_13335 {

	public static void main(String[] args) throws IOException{
		// 첫 번째 줄에는 n은 다리를 건너는 트럭의 수, w는 다리의 길이, 그리고 L은 다리의 최대하중
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); // 다리를 건너는 트럭 
		int w = Integer.parseInt(st.nextToken()); // 다리 길이
		int L = Integer.parseInt(st.nextToken()); // 다리 무게
		
		int truck[] = new int[n];
		int l_weight = 0; // 다리에 있는 트럭무게 
		int time =0;  // 시간 
		
		Queue<Integer> que = new LinkedList<>();
		st = new StringTokenizer(br.readLine());
		// 트럭값 입력받기 
		for(int i = 0; i < n; i++) {
			truck[i] = Integer.parseInt(st.nextToken());
		}
		for(int i =0; i < w; i++) {
			que.offer(0);
		}
		int idx = 0;
		 while (idx < n) {
	            // 1. 다리 끝에서 트럭 제거
	            l_weight -= que.poll();
	            
	            // 2. 현재 트럭을 다리에 올릴 수 있는지 확인
	            if (l_weight + truck[idx] <= L) {
	                que.offer(truck[idx]); // 트럭을 다리에 올림
	                l_weight += truck[idx];
	                idx++; // 다음 트럭으로 이동
	            } else {
	                que.offer(0); // 무게 초과로 트럭을 올리지 못하면 빈 공간 추가
	            }
	            
	            // 3. 시간 증가
	            time++;
	        }
	        
	        // 마지막 트럭이 다리를 완전히 건너는 시간 추가
	        time += w;

	        System.out.println(time);
	    }
	}
