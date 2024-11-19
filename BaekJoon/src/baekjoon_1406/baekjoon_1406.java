package baekjoon_1406;

import java.io.*;
import java.util.*;

public class baekjoon_1406 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // 입력 문자열
        String N = br.readLine();
        int M = Integer.parseInt(br.readLine()); // 명령어 개수

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        // 초기 문자열을 left 스택에 삽입
        for (char c : N.toCharArray()) {
            left.push(c);
        }

        // 명령어 처리
        for (int i = 0; i < M; i++) {
            String command = br.readLine();

            switch (command.charAt(0)) {
                case 'L': // 커서를 왼쪽으로
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;

                case 'D': // 커서를 오른쪽으로
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;

                case 'B': // 커서 왼쪽 문자 삭제
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;

                case 'P': // 커서 왼쪽에 문자 추가
                    left.push(command.charAt(2)); // 'P x'에서 x를 가져옴
                    break;
            }
        }

        // 결과 조합: left + right (right는 역순으로 추가)
        while (!left.isEmpty()) {
            right.push(left.pop());
        }
        while (!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb.toString());
    }
}