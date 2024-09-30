package algorithms_Java_03;

import java.io.*;
import java.util.*;

public class baekjoon_2501  {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		ArrayList<Integer> measure = new ArrayList<>();
		
		for(int i = 1; i <=N; i++) {
			if(N % i == 0) {
				measure.add(i);
			}
		}
		// K번째 약수가 존재하는지 확인
        if(K <= measure.size()) {
            System.out.println(measure.get(K-1));  // K번째 약수 출력 (K-1은 인덱스)
        } else {
            System.out.println(0);  // K번째 약수가 없으면 0 출력
        }
	}
	
	
}
