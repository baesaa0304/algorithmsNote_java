package algorithms_Java01_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
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
		
		Queue<Integer> bridge_list = new LinkedList<>();
		 for (int i = 0; i < truck_weights.length; i++) {
		 	for (int j = 0; j < bridge_length; j++) {
		 		bridge_list.offer(truck_weights[i]);
		 		time++;
		 	}	 
			 
		 }
		 System.out.println(time);
		
		
	}

}
