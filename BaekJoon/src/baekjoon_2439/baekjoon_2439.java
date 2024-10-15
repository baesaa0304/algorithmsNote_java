package baekjoon_2439;

import java.io.*;

public class baekjoon_2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < N; i++) {
            // 공백 출력: N - i - 1 개의 공백
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // 별 출력: i + 1 개의 별
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈
        }
    }
}

