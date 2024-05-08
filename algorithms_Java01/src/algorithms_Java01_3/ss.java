package algorithms_Java01_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ss {
	
	     
	    public static void main(String[] args) throws IOException {
	    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    	StringTokenizer st = new StringTokenizer(br.readLine());
	        int bridge_length = Integer.parseInt(st.nextToken());
	        int weight = Integer.parseInt(st.nextToken());
	        
	        StringTokenizer truckTokenizer = new StringTokenizer(br.readLine());
	        int[] truck_weights = new int[truckTokenizer.countTokens()];
	        for (int i = 0; i < truck_weights.length; i++) {
	            truck_weights[i] = Integer.parseInt(truckTokenizer.nextToken());
	        }
	        
	        int time = 0; // 시간 초
	        
	        Queue<Integer> bridge_list = new LinkedList<>(); // 건너야 하는 다리
	        for (int j = 0; j < bridge_length; j++) { // 다리 길이만큼 0으로 초기화
	            bridge_list.offer(0);
	        }
	        
	        int bridge_weight = 0; // 현재 다리 위의 총 무게
	        int idx = 0; // 다음으로 다리에 진입할 트럭 인덱스
	        
	        while (!bridge_list.isEmpty()) {
	            bridge_weight -= bridge_list.poll(); // 다리에서 나가는 트럭의 무게를 빼줌
	            
	            if (idx < truck_weights.length && bridge_weight + truck_weights[idx] <= weight) {
	                bridge_list.offer(truck_weights[idx]); // 다리에 트럭 추가
	                bridge_weight += truck_weights[idx]; // 다리 위 무게 갱신
	                idx++; // 다음 트럭 인덱스로 이동
	            } else {
	                bridge_list.offer(0); // 무게가 초과되면 빈 자리로 채움
	            }
	            
	            time++; // 시간 증가
	        }
	        
	        System.out.println(time);
	    
	    }
 }
