package baekjoon_17298;

import java.io.*;
import java.util.*;

public class baekjoon_17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        
        int A = Integer.parseInt(br.readLine()); // 수열의 길이
        int[] sequence = new int[A];  // 수열 저장 배열
        int[] result = new int[A];  // 오큰수를 저장할 배열
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        // 수열 입력받기
        for (int i = 0; i < A; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
            result[i] = -1;  // 기본적으로 오큰수는 -1로 초기화
        }
        
        // 스택을 사용하여 오큰수를 찾기
        for (int i = 0; i < A; i++) {
            // 스택이 비어 있지 않고, 현재 값이 스택의 top 값보다 크다면
            while (!stack.isEmpty() && sequence[stack.peek()] < sequence[i]) {
                int idx = stack.pop();  // 현재 값보다 작은 값의 인덱스
                result[idx] = sequence[i];  // 그 값의 오큰수를 현재 값으로 설정
            }
            
            // 현재 인덱스를 스택에 넣음
            stack.push(i);
        }

        // 결과 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            sb.append(result[i]).append(" ");
        }
        System.out.println(sb.toString().trim());  // 한 번에 출력
    }
}