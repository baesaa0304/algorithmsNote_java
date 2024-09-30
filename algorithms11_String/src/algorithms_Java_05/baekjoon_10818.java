package algorithms_Java_05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baekjoon_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];

        // 한 줄에 N개의 숫자가 입력된다고 가정
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        // 초기값 설정
        int min_number = Integer.MAX_VALUE; // 최대값으로 초기화
        int max_number = Integer.MIN_VALUE; // 최소값으로 초기화

        // 최소값과 최대값 찾기
        for (int i = 0; i < numbers.length; i++) {
            if (min_number > numbers[i]) {
                min_number = numbers[i];
            }
            if (max_number < numbers[i]) {
                max_number = numbers[i];
            }
        }
        
        // 결과 출력
        System.out.println(min_number + " " + max_number);
    }
}
