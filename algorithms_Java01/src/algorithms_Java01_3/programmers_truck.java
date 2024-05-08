package algorithms_Java01_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class programmers_truck {
     

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
		
		// 시작
		int time = 0; // 시간 초
		int bride_weight = 0; //다리 위의 무게
		
		Queue<Integer> bridge_list = new LinkedList<>(); // 건너야 하는 다리
		 for (int i = 0; i < truck_weights.length; i++) {
			 while (true) {
				 for(int j =0; j < bridge_length; j++) {
					 if (weight > bride_weight) {
						 bridge_list.offer(truck_weights[i]);
						 bride_weight += truck_weights[i];
						 System.out.println("1. 추가 다리무게 : " + bride_weight);
						 System.out.println("2. 추가 다리 : " + bridge_list);
						 time++;
					 }	 
					else if (weight <= bride_weight) {
						bridge_list.poll();
						System.out.println("3. 빠지고 난 후 다리 : " + bridge_list);
						time++;
						System.out.println("4. poll된 시간 :" + time);
					 }
					 
					
				 }
				 if (bridge_list.isEmpty()) {
					 break;
				 }
				 
			 } 
		 }
		 System.out.println(time + 1);
		
	}

}
