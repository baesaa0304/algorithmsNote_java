package algorithms_Java_15;

import java.util.*;
import java.io.*;

public class baekjoon_1158 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        // 큐에 1부터 N까지의 숫자를 넣는다
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        sb.append("<");
        while (!queue.isEmpty()) {
            // k번째 사람을 제거하기 위해 k-1번째까지는 맨 앞의 요소를 맨 뒤로 보낸다
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }

            // k번째 사람을 출력하고 큐에서 제거한다
            sb.append(queue.poll());

            if (!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");

        System.out.println(sb);
    }
}
