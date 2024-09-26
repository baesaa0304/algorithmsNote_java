package algorithms_Java_22;

import java.io.*;
import java.util.*;

public class baekjoon_10845 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> result = new ArrayList<>();
		Queue<Integer> que = new LinkedList<>();
		
		for (int i = 0; i < num; i++) {
            String command = br.readLine();
            if (command.startsWith("push")) {
                // "push 10" 과 같이 숫자를 파싱
                int value = Integer.parseInt(command.split(" ")[1]);
                que.add(value);
            } else if (command.equals("pop")) {
                if (que.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(que.poll());
                }
            } else if (command.equals("front")) {
                if (que.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(que.peek());
                }
            } else if (command.equals("back")) {
                if (que.isEmpty()) {
                    result.add(-1);
                } else {
                    // LinkedList로 캐스팅하여 마지막 요소를 가져옴
                    result.add(((LinkedList<Integer>) que).peekLast());
                }
            } else if (command.equals("size")) {
                result.add(que.size());
            } else if (command.equals("empty")) {
                if (que.isEmpty()) {
                    result.add(1);
                } else {
                    result.add(0);
                }
            }
        }
		
		
        // 결과 출력
        for (int res : result) {
            System.out.println(res);
        }
    }
}
			