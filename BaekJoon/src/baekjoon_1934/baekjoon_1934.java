package baekjoon_1934;

import java.io.*;
import java.util.*;

public class baekjoon_1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < T; i++) {
        	 StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int Mut = 1; // Mut 초기화

            // 최대공약수 (GCD) 구하기
            for (int j = 2; j <= Math.min(N, M); j++) {
                while (N % j == 0 && M % j == 0) {
                    Mut *= j; // Mut에 최대공약수를 곱함
                    N /= j;
                    M /= j;
                }
            }

            // 최소공배수는 (원래 N * 원래 M) / 최대공약수
            result.add(Mut * N * M); // 최소공배수 계산 후 결과 리스트에 추가
        }

        // 결과 출력
        for (int i : result) {
            System.out.println(i);
        }
    }
}