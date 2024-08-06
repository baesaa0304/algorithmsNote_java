package algorithms_Java_01;

import java.util.*;
import java.io.*;

public class baekjoon_11399 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] atm = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		 for (int i = 0; i < N; i++) {
	            atm[i] = Integer.parseInt(st.nextToken());
	        }
		Arrays.sort(atm);
		int result = 0;
		int sum[] = new int[N];
		sum[0] =  atm[0];
		for(int i = 1; i < N; i++) {
			sum[i] += sum[i - 1] + atm[i];
		}
		for(int i = 0; i < N; i++) {
			result += sum[i];
		}
		System.out.println(result);
	}

}
