package baekjoon_1874;

import java.util.*;
import java.io.*;
public class baekjoon_1874 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); 
		Stack<Integer> stack = new Stack<>();
		int N = Integer.parseInt(br.readLine());
		int start = 1;
		for(int i = 0; i < N; i++) {
			int number = Integer.parseInt(br.readLine());
			
			while(start <= number) {
				stack.push(start++);
				sb.append("+\n");
			}
			if(stack.peek() == number) {
				stack.pop();
				sb.append("-\n");
			}
			else {
				System.out.println("NO");
				return;
			}
			
		}
		System.out.println(sb.toString());

	}

}
