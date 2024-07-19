package algorithms_Java01_18;

import java.util.*;
//
//class Solution {
//	public int solution(int bridge_length, int weight, int[] truck_weights) {
//		Queue<Integer> queue = new LinkedList<Integer>(); // 트럭이 지나가는 다리 
//		int time = 0; // 트럭이 지나가는 시간 
//		int bridge_wegiht = 0; //다리 위에 있는 트럭의 무게 
//		for(int i : truck_weights) {
//			// 다리위에 트럭이 없는경우 
//			if(queue.isEmpty()) {
//				queue.offer(i);
//				bridge_wegiht += i;
//				time++;
//			}
//			// 다리길이 트럭이 꽉 찬 경우 
//			else if(queue.size() == bridge_length) {
//				int poll = queue.poll();
//				bridge_wegiht -= poll;
//				time++;
//				//다리에서 트럭이 빠져나갔을때 다리 위에 트럭무게가 weight보다 같거나 적은 경우 
//				if(bridge_wegiht <= weight) {
//					queue.offer(i);
//					bridge_wegiht += i;
//					time++;
//				}
//			}
//			else {
//				queue.offer(0);
//				time++;
//			}
//		}
//		time += bridge_length;
//		return time;
//	}
//}
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int totalWeight = 0;

        for (int truckWeight : truck_weights) {
            while (true) {
                if (queue.isEmpty()) {
                    queue.offer(truckWeight);
                    totalWeight += truckWeight;
                    answer++;
                    break;
                } else if (queue.size() == bridge_length) {
                    totalWeight -= queue.poll();
                } else {
                    if (totalWeight + truckWeight > weight) {
                        queue.offer(0);
                        answer++;
                    } else {
                        queue.offer(truckWeight);
                        totalWeight += truckWeight;
                        answer++;
                        break;
                    }
                }
            }
        }

        return answer + bridge_length;
    }
}
public class progrmmers_42583 {

	public static void main(String[] args) {
		Solution solution = new Solution();
		int bridege = 2;
		int weights = 10;
		int [] truck = {7,4,5,6};
		int result = solution.solution(bridege, weights, truck);
		System.out.println("총 걸린 시간" + result);

	}

}
