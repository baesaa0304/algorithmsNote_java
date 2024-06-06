package algorithms_Java01_c;

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
		
		int answer = 0;
        int bridge_weight=0;
        Queue<Integer> bridge_list  = new LinkedList<Integer>();
        
        for(int i = 0; i < truck_weights.length; i++){
        while(true){
            //다리에 트럭 없는 경우
            if(bridge_list.isEmpty()){
                bridge_list.offer(truck_weights[i]);
                bridge_weight+=truck_weights[i];
                answer++;
                break;
            }
            //다리가 꽉 찬 경우
            else if(bridge_list.size()==bridge_length){
                bridge_weight-=bridge_list.poll();
            }
            else{
                //다리에 트럭을 실을 수 있을 경우
                if(bridge_weight+truck_weights[i]<=weight){
                    bridge_list.offer(truck_weights[i]);
                    bridge_weight+=truck_weights[i];
                    answer++;
                    break;
                }
                else{
                    //다리에 트럭 무게가 초과인 경우
                    //가상으로 0을 채워줌
                    bridge_list.offer(0);
                    answer++;
                }
                }
            }
        }
        
        //마지막 트럭이 빠져나오는 시간
        answer += bridge_length;
		System.out.println(answer);
		
	}

}
