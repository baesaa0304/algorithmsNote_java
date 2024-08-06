package algorithms_Java_01;

import java.util.*;
import java.io.*;

public class baekhoon2805_fail {

	public static void main(String[] args) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 나무의 개수
		int M = Integer.parseInt(st.nextToken()); // 가져가야할 나무 수 길이
		int[] trees = new int[N];
		StringTokenizer truckTokenizer = new StringTokenizer(br.readLine());
		for (int i =0; i < N; i++) {
			trees[i] = Integer.parseInt(truckTokenizer.nextToken()); // 현재 있는 나무들
		}
		
		int max_tree = Integer.MIN_VALUE; // 나무들 중 가장 큰 나무
		int min_tree = Integer.MAX_VALUE; // 나무들 중 가장 작은 나무
		for (int i = 0; i < N; i++) {
            max_tree = Math.max(max_tree, trees[i]);
            min_tree = Math.min(min_tree, trees[i]);
        }
		int mid = (max_tree + min_tree) / 2; // 자를 나무의 높이를 정함.
		while(true) {
			int cutTree = 0; // 자른 나무의 수
			for (int i = 0; i < trees.length; i++) {
					if(trees[i] > mid) {
						cutTree += (trees[i] - mid);
					}	
			 }
			 if (cutTree <= M) {
				 System.out.println(mid); // 길이를 정해야 하는 나무의 수
				 break;
			} else {
				mid = mid + 1;
			}
		}
		
	}

}

