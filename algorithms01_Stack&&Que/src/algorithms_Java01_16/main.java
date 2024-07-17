package algorithms_Java01_16;

import java.util.LinkedList;
import java.util.Queue;

public class main {

	public static void main(String[] args) {
		Queue<Double> que = new LinkedList<>();

        // 총 작업량
        double totalWork = 70;
        
        // 하루 작업량 비율 (30%)
        double dailyWorkRate = 30;

        // 하루 작업량 계산
        double dailyWork = totalWork * dailyWorkRate;

        // 필요한 일수 계산
        double requiredDays = Math.ceil(totalWork / dailyWorkRate);

        // 큐에 필요한 일수 추가
        que.offer(requiredDays);

        // 큐 출력
        System.out.println("Required days: " + requiredDays);
        System.out.println("Queue: " + que);
    

	}

}
