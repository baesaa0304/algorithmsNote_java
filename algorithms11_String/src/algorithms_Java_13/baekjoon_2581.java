package algorithms_Java_13;

import java.io.*;
import java.util.*;
public class baekjoon_2581 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arr = new ArrayList<>();
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int min_num = 100001;
		
		for(int i = M; i <= N; i++) {
			if (i <= 1) continue;  
			 boolean isPrime = true;
			 
			for(int j = 2; j <Math.sqrt(i); j++) { 
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				arr.add(i);
			}
		}
		if(arr.size() > 0) {
			for(int i : arr) {
				sum+= i;
				if(min_num > i) {
					min_num = i;
				}
			}
			System.out.println(sum);
			System.out.println(min_num);
		}
		else {
			System.out.println(-1);
		}
	}
}
