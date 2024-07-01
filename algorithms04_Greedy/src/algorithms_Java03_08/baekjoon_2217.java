package algorithms_Java03_08;

import java.util.*;
import java.io.*;

public class baekjoon_2217 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer [] weight = new Integer [N];
		for(int i = 0; i < N; i++) {
			weight[i] = Integer.parseInt(br.readLine());
		}
		int max_weight = 0;
		Arrays.sort(weight);
//		Arrays.sort(weight, Collections.reverseOrder());
//		for (int i = 0; i < N; i++) {
//			max_weight = Math.max(max_weight, weight[i] * (i+1));
//        }
		for (int i = 0; i < N; i++) {
			max_weight = Math.max(max_weight, weight[i] * (N - i));
        }
        System.out.print(max_weight);

	}

}
