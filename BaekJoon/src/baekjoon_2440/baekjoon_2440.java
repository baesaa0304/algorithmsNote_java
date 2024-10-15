package baekjoon_2440;

import java.io.*;


public class baekjoon_2440 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            // 별 출력 (N - i 개의 별)
            for (int j = N; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();  // 줄바꿈 (공백 없이)
        }
    }
}

