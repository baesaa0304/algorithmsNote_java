package algorithms_Java_10;

import java.io.*;
import java.util.*;

public class baekjoon_2693 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        int[] result = new int[T]; 

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] test = new int[10]; 

            // 10개의 숫자를 배열에 저장
            for (int j = 0; j < 10; j++) {
                test[j] = Integer.parseInt(st.nextToken());
            }

            // 배열을 내림차순으로 정렬
            Arrays.sort(test);

           
            result[i] = test[7];
        }

       
        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }
    }
}