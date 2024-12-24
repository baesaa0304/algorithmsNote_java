package baekjoon_6588;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_6588 {

	public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        boolean[] isPrime = new boolean[N + 1];
        for (int i = 2; i <= N; i++) {
            isPrime[i] = true; // 초기화: 모든 숫자를 소수로 가정
        }
     // 에라토스테네스의 체 알고리즘
        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) { // 소수이면
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false; // 배수를 제거
                }
            }
        }
   

	}

}
