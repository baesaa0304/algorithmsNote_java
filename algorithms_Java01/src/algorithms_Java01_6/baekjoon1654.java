package algorithms_Java01_6;

import java.util.*;
import java.io.*;

public class baekjoon1654 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [] Lines = new int [N];
		
		long max_line = 0;

		for (int i =0; i < N; i++) {
			Lines[i] = Integer.parseInt(br.readLine());
			max_line = Math.max(max_line, Lines[i]);
		}
		
		long min_line = 1;
		
		while(min_line <= max_line) {
			
			long mid = (max_line + min_line) / 2;
			System.out.println("mid 값 " + mid);
			int total_line = 0;
			for(int line : Lines) {
				total_line += (line / mid);
			}
			System.out.println("total_line 값 " + total_line);
			
			if (total_line >= M) {
				min_line = mid+1;
				System.out.println("min_line 값" + min_line);
			} else {
				max_line = mid-1;
				System.out.println("max_line 값 " + max_line);
			}
		}
		System.out.println(max_line);
	}

}
