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
		for(int i = 0; i < n; i++) {
			while(true) {
				if(que.isEmpty()) {
					que.offer(truck[i]);
					l_weight+=truck[i]; // 무게를 추가해줌 
					time++;
					break;
				}
				else if(que.size() == w) { // 트럭 길이 만큼 찬 경우 
					int poll = que.poll();
					l_weight -= poll;
					time++;
				}
				else if(l_weight + truck[i] <= L) { // 트럭이 무게를 초과하지 않는 경우 
					que.offer(truck[i]);
					l_weight  += truck[i];
					time++;
					break;
				}
				else {
					que.offer(0); //트럭이 무게 초과하는 경우는 0으로 
					time++;
				}
			}
		}
		time += w;
		
		System.out.println(time);

	}

}
