package algorithms_Java01_2;

import java.util.*;
import java.io.*;

public class baekjoon1158 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer>que = new LinkedList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        for (int i = 0; i < N; i++) {
        	que.offer(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while(que.size()!= 1) {
        	for(int i =0; i < M - 1; i++) {
            	que.offer(que.poll());
            	System.out.println("que poll : " + que.offer(que.poll()));
            } 
        	sb.append(que.poll()).append(", ");
        } 
      sb.append(que.poll()).append(">");
      System.out.println(sb);
	}
	
}
