package algorithms_Java03_03;

import java.util.*;
import java.io.*;

public class baekjoon_12845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer card[] = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i< N; i++) {
			card[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(card, Comparator.reverseOrder()); // 내림차순
		int maxcard = card[0];
		int gold = 0;
		for(int i = 1; i < card.length; i++) {
			gold += (maxcard + card[i]);
		}
		System.out.println(gold);
		
	}	 

}
