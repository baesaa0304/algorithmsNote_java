package algorithms_Java02_6;

import java.util.*;
import java.io.*;

public class baekjoon_2178 {
	static int N, M;
	static int arr[][];
	static int visit[][];
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		for(int i =0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}
		
	}

}
