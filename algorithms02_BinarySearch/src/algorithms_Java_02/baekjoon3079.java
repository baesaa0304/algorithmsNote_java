package algorithms_Java_02;

import java.util.*;
import java.io.*;

public class baekjoon3079 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 입국 검사자 수
		int M = Integer.parseInt(st.nextToken()); // 입국검사를 받을 사람들
		int [] times = new int[N];
		int max_value= 0;
		for (int i = 0; i < N; i++) {
			StringTokenizer tk = new StringTokenizer(br.readLine());
			times[i] = Integer.parseInt(tk.nextToken());
			max_value = Math.max(max_value,times[i]);
		}
		Arrays.sort(times);
		long max_time = (max_value) * 1000000000L;
		long min_time = 0L;
		long find_time = 0L; // 심사를 걸리는 시간 최소
		
		while(min_time < max_time) {
			long mid = (min_time + max_time) / 2;
			long people = 0; // 입국 심사 끝난 사람
			for(long time : times) {
				people += mid / time;
			}
			if (people > N) {
				find_time = mid;
				max_time = mid - 1;
			}
			else {
				min_time = mid + 1;
			}
		}
		System.out.println(find_time);
	}

}
