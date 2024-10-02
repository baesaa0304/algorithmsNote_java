package algorithms_Java_09;

import java.io.*;
import java.util.*;

public class baekjoon_2609 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int leastCommonMultiple = 1;
		int MaximumCommonMultiple = 1;
		// 2와 3을 포함하여 공통으로 나눌 수 있는 수들을 찾습니다.
        for (int i = 2; i <= Math.min(N, M); i++) {
            while (N % i == 0 && M % i == 0) {
            	leastCommonMultiple *= i; // 공통으로 나눌 수 있는 값 곱하기
                N /= i;
                M /= i;
            }
        }
        MaximumCommonMultiple = leastCommonMultiple * N * M;
		System.out.println(leastCommonMultiple + " " + MaximumCommonMultiple);
	}

}
