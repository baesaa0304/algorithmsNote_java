package baekjoon_10866;

import java.io.*;
import java.util.*;

public class baekjoon_10866 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new LinkedList<>();
		List<Integer> result = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String q = st.nextToken();
			
			// 앞에 수 넣기 
			if(q.equals("push_front")) {
				int c = Integer.parseInt(st.nextToken());
				deque.offerFirst(c);
			}
			//뒤에 수 넣기 
			else if(q.equals("push_back")) {
				int c = Integer.parseInt(st.nextToken());
				deque.offerLast(c);
			}
			// 가장 앞에 수 빼기 
			else if(q.equals("pop_front")) {
				if(deque.isEmpty()) {
					result.add(-1);
				}
				else {
					result.add(deque.pollFirst());
				}
				
			}
			
			// 가장 뒤에 수 빼기
			else if(q.equals("pop_back")) {
				if(deque.isEmpty()) {
					result.add(-1);
				}
				else {
					result.add(deque.pollLast());
				}
				
			}
			// 큐 사이즈 출력 
			else if(q.equals("size")) {
				result.add(deque.size());
			}
			
			 // 큐 비어 있는지 확인
			else if(q.equals("empty")) {
				if(deque.isEmpty()) {
					result.add(1);
				}
				else {
					result.add(0);
				}
			}
			// 큐 앞에 수 출력
			else if(q.equals("front")) {
				if(deque.isEmpty()) {
					result.add(-1);
				}
				else {
					result.add(deque.peekFirst());
				}
				
			}
			
			// 큐 에 수 출력
			else if(q.equals("back")) {
				if(deque.isEmpty()) {
					result.add(-1);
				}
				else {
					result.add(deque.peekLast());
				}
				
			}			
			
		}
		for(int i : result) {
			System.out.println(i);
		}
		
	}

}
