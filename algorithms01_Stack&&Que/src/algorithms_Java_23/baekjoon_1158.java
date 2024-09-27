package algorithms_Java_23;

import java.io.*;
import java.util.*;

public class baekjoon_1158 {

	public static void main(String[] args) throws IOException {
		Queue<Integer> que = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int index = 0 ;
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= N; i++) {
			que.add(i);
		}
		sb.append("<");
		while(!que.isEmpty()) {
			for(int i = 0; i < M - 1; i++) {
				que.add(que.poll());
			}
			sb.append(que.poll());
			if (!que.isEmpty()) {
                sb.append(", ");
            }
			
		}
		sb.append(">");
		System.out.println(sb);

	}

}
